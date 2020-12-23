package com.fincityltd.services;

import com.fincityltd.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: 20");
    }
}
