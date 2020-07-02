package com.andreeagrosu;

import java.util.Date;

public class FlightAttendant extends AirlineEmployee{

    private Languages language1;
    private Languages language2;
    private Languages language3;

    public FlightAttendant(String name, Date birthdate, String phoneNumber, double salary) {
        super(name, birthdate, phoneNumber, salary);
        this.language1 = Languages.values()[(int)(Math.random()*Languages.values().length)];
        this.language2 = Languages.values()[(int)(Math.random()*Languages.values().length)];
        this.language3 = Languages.values()[(int)(Math.random()*Languages.values().length)];

    }

    public Languages getLanguage1() {
        return language1;
    }

    public Languages getLanguage2() {
        return language2;
    }

    public Languages getLanguage3() {
        return language3;
    }
}
