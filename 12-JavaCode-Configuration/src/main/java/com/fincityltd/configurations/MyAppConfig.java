package com.fincityltd.configurations;

import com.fincityltd.interfaces.ExtraSessions;
import com.fincityltd.services.Java;
import com.fincityltd.services.OfficeHours;
import com.fincityltd.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fincityltd")
public class MyAppConfig {

    @Bean
    public Java java(){
        return new Java(officeHours());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }

    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }
}
