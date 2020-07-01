package com.andreeagrosu;

import java.util.Date;

public abstract class AirlineEmployee {

    private String name;
    private Date birthdate;
    private Languages language;
    private String phoneNumber;
    private double salary;

    public Languages getLanguage() {
        return language;
    }
}
