package com.finctyltd.services;

import com.finctyltd.interfaces.Course;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: 10");
    }
}
