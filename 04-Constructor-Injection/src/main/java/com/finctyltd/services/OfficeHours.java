package com.finctyltd.services;

import com.finctyltd.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 5;
    }
}
