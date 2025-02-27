package com.mycolap.spring_boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping("/data")
    public String anyThing(){
        return "dataaaaaaaaaaaaaaaa";
    }

}
