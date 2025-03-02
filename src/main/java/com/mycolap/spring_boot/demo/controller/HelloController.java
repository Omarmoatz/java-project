package com.mycolap.spring_boot.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${owner.name}")
    private String myName;

    @Value("${owner.team}")
    private String myTeam;

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
