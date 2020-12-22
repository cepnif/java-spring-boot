package com.fincityltd.services;

import com.fincityltd.interfaces.Course;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Java implements Course {

    private OfficeHours officeHours;

    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: " +(20 + officeHours.getHours()));
    }
}
