package com.finctyltd.services;

import com.finctyltd.interfaces.Course;

public class Java implements Course {

    OfficeHours officeHours;

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: " +(20 + officeHours.getHours()));
    }
}
