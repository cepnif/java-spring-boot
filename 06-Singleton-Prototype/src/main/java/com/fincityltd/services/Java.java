package com.fincityltd.services;

import com.fincityltd.interfaces.Course;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: 20 ");
    }
}
