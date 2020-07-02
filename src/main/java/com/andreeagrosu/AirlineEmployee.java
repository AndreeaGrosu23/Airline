package com.andreeagrosu;

import java.util.Date;

public abstract class AirlineEmployee {

    private String name;
    private Date birthdate;
    private String phoneNumber;
    private double salary;

    public AirlineEmployee(String name, Date birthdate, String phoneNumber, double salary) {
        this.name = name;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
