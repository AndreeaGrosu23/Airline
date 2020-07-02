package com.andreeagrosu;

import java.util.Date;
import java.util.Random;

public abstract class Pilot extends AirlineEmployee {

    PilotPosition position;
    Random random = new Random();

    public Pilot(String name, Date birthdate, String phoneNumber, double salary, PilotPosition position) {
        super(name, birthdate, phoneNumber, salary);
        this.position = position;
    }

    public static Pilot createPilot(String name, Date birthdate, String phoneNumber, double salary,PilotPosition position) {

        if (position==PilotPosition.CAPTAIN) {
            return new Captain(name,birthdate,phoneNumber,salary,position);
        } else if (position==PilotPosition.ALL) {
            return new Copilot(name,birthdate,phoneNumber,salary,position);
        }
        return null;
    }

    public boolean hasCompass() {
        return random.nextBoolean();
    }

}
