package com.utils;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    // should not be more than one primary annotation on the any class from the same interface
public class October implements Months{

    private October(){
        System.out.println("in constructor October");
    }
    
    @Override
    public String welcome(){
        return "***************  welcome October => ******************";
    }
    
}