package com.fincityltd.configurations;

import com.fincityltd.services.Java;
import com.fincityltd.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fincityltd")
public class MyAppConfig {

    @Bean
    public Java java(){
        return new Java();
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
}
