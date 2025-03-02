package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.Couch;
import com.utils.Months;

@RestController
public class HelloController {
    
    @Value("${owner.name}")
    private String myName;

    @Value("${owner.team}")
    private String myTeam;

    // dependencies
    private Couch myCouch;
    private Months month;

    
    @Autowired   // for dependency injection  
    private HelloController(Couch couch, Months month){
        this.myCouch = couch;
        this.month = month;
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
