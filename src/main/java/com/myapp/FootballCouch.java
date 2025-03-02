package com.myapp;

import org.springframework.stereotype.Component;

@Component
public class FootballCouch implements Couch{
    
    @Override
    public String getDailyWorkout(){
        return "you have to start training  football NOW ASAP";
    }
    
    
}
