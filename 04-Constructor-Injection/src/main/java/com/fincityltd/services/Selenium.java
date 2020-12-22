package com.fincityltd.services;

import com.fincityltd.interfaces.Course;
import com.fincityltd.interfaces.ExtraSessions;

public class Selenium implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Selenium teaching hours: 20");
    }
}
