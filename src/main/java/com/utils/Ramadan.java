package com.utils;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Ramadan implements Months{

    private Ramadan(){
        System.out.println("in constructor Ramadan");
    }
    
    @Override
    public String welcome(){
        return "-------------- Welcome Ramadan :) ---------------";
    }
}


