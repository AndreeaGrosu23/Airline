package com.andreeagrosu;

import java.util.Date;

public class Captain extends Pilot {

    public Captain(String name, Date birthdate, PilotPosition position, boolean hasCompass) {
        super(name, birthdate, PilotPosition.CAPTAIN, hasCompass);
    }
}
