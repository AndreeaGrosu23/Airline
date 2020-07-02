package com.andreeagrosu;

import java.util.Date;

public class Copilot extends Pilot {

    public Copilot(String name, Date birthdate, String phoneNumber, double salary, PilotPosition position) {
        super(name, birthdate, phoneNumber, salary, PilotPosition.ALL);
    }
}
