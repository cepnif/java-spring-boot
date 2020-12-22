package com.fincityltd.services;

import com.fincityltd.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 11;
    }
}
