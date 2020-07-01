package com.andreeagrosu;

import java.util.Date;

public abstract class Pilot extends AirlineEmployee {

    PilotPosition position;
    boolean hasCompass;

    public Pilot(String name, Date birthdate, PilotPosition position, boolean hasCompass) {
        super(name, birthdate);
        this.position = position;
        this.hasCompass = hasCompass;
    }

    public static Pilot createPilot(PilotPosition position) {

        if (position==PilotPosition.CAPTAIN) {
            return new Captain();
        } else if (position==PilotPosition.ALL) {
            return new Copilot();
        }
        return null;

    }

    public PilotPosition getPosition() {
        return position;
    }

    public void setPosition(PilotPosition position) {
        this.position = position;
    }

    public boolean isHasCompass() {
        return hasCompass;
    }

    public void setHasCompass(boolean hasCompass) {
        this.hasCompass = hasCompass;
    }
}
