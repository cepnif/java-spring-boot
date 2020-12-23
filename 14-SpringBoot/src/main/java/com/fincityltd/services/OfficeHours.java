package com.fincityltd.services;

import com.fincityltd.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    @Override
    public int getHour() {
        return 230;
    }
}
