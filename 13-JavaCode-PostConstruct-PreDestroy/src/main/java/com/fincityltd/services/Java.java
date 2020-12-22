package com.fincityltd.services;

import com.fincityltd.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: 67");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct is executed");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy is executed");
    }


}
