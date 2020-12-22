package com.fincityltd.services;

import com.fincityltd.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Selenium teaching hours: 18");
    }
}
