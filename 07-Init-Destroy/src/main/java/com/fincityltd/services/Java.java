package com.fincityltd.services;

import com.fincityltd.interfaces.Course;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: 23");
    }
}
