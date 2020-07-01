package com.andreeagrosu;

public class Flight {

    int id;
    Languages language;
    static int counter=0;
    int numberPassengers;
    static int minPassengers=100;
    static int maxPassengers=220;

    public Flight(int id, Languages language, int numberPassengers) {
        counter++;
        this.id = counter;
        this.language = language;
        this.numberPassengers = numberPassengers;
    }

    public int getId() {
        return id;
    }

    public Languages getLanguage() {
        return language;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }
}
