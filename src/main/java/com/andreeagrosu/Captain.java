package com.andreeagrosu;

import java.util.Date;

public class Captain extends Pilot {

    public Captain(String name, Date birthdate, String phoneNumber, double salary, PilotPosition position) {
        super(name, birthdate, phoneNumber, salary, PilotPosition.CAPTAIN);
    }
}
