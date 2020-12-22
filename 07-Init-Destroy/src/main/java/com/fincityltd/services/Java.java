package com.fincityltd.services;

import com.fincityltd.interfaces.Course;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: 23");
    }

    public void myInitMethod(){
        System.out.println("Init method executed");
    }

    public void myDestroyMethod(){
        System.out.println("Destroy method executed");
    }
}
