package com.andreeagrosu;

import java.util.Date;

public class Copilot extends Pilot {

    public Copilot(String name, Date birthdate, PilotPosition position, boolean hasCompass) {
        super(name, birthdate, PilotPosition.ALL, hasCompass);
    }
}
