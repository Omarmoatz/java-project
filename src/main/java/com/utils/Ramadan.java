package com.utils;

import org.springframework.stereotype.Component;

@Component
public class Ramadan implements Months{
    
    @Override
    public String welcome(){
        return "-------------- Welcome Ramadan :) ---------------";
    }
}
