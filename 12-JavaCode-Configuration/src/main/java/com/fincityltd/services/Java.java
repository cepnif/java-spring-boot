package com.fincityltd.services;

import com.fincityltd.interfaces.Course;
import com.fincityltd.interfaces.ExtraSessions;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Java implements Course {

    private ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: " +(30 + extraSessions.getHours()));
    }
}
