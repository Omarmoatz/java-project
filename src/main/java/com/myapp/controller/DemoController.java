package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.Couch;
import com.utils.Months;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


// @primary , lazy initialization(global, @lazy) , @scope
 

@RestController
public class DemoController {
    
    @Value("${owner.name}")
    private String myName;

    @Value("${owner.team}")
    private String myTeam;

    // dependencies
    @Autowired  // for field injection
    private Couch myCouch;
    
    private Months anotherMonth;
    private Months month;

    
    @Autowired   // for dependency injection  
    private DemoController(
        @Qualifier("eid") Months month,
        @Qualifier("ramadan") Months anotherMonth
    ){
        System.out.println("in constructor DemoController");
        // this.myCouch = couch;
        this.month = month;
        this.anotherMonth = anotherMonth;
    }

    @PostConstruct
    public void myStartingCode(){
        System.out.println("this is my---Stating---Code");
    }

    @PreDestroy
    public void preDestroyCode(){
        System.out.println("this is pre---Destroy---Code");
    }

    @GetMapping("/check")
    public String check(){
        return "is month = another month >>>>>>  " + (month == anotherMonth);
    }

    @GetMapping("/get-workout")
    public String getWorkout(){
        return myCouch.getDailyWorkout();
    }

    @GetMapping("/get-month")
    public String getMonth(){
        return month.welcome();
    }

    @GetMapping("/my-info")
    public String myInfo(){
        return "my name is: " + myName + ", my team is: " + myTeam;
    }
    
    @GetMapping("/")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping("/data")
    public String anyThing(){
        return "dataaaaaaaaaaaaaaaa";
    }


}
