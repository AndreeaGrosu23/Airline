package com.andreeagrosu;

import java.util.Date;

public class FlightAttendant extends AirlineEmployee{

    private Languages language;

    public FlightAttendant(String name, Date birthdate, Languages language) {
        super(name, birthdate);
        this.language = language;
    }

    public Languages getLanguage() {
        return language;
    }

    public void setLanguage(Languages language) {
        this.language = language;
    }
}
