package com.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.utils.Eid;
import com.utils.Months;

@Configuration
public class HolidaysConf {
    

    @Bean
    public Months eid(){
        return new Eid();
    }
}
