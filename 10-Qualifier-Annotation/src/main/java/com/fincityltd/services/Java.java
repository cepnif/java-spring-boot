package com.fincityltd.services;

import com.fincityltd.interfaces.Course;
import com.fincityltd.interfaces.ExtraSessions;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private ExtraSessions extraSessions;

    public Java(@Qualifier("interviewHours")ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours:" + extraSessions.getHours());
    }
}
