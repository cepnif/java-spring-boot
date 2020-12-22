package com.fincityltd.services;

import com.fincityltd.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class InterviewHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 6;
    }
}
