package com.andreeagrosu;

import java.util.Date;

public class Main {

    public static void main (String[] args) {

        System.out.println("Modeling an Airline's internal structure.");

        Flight flightOne = new Flight(Languages.ENGLISH);

        Pilot captainOne = Pilot.createPilot("John Doe", new Date(1987-7-3), "0724546532", 5000,PilotPosition.CAPTAIN);
        Pilot copilotOne = Pilot.createPilot("Joe Doe", new Date(1986-2-13), "0729697772", 4000,PilotPosition.ALL);

        flightOne.addPilot(captainOne);
        flightOne.addPilot(copilotOne);

        FlightAttendant flightAttendantOne = new FlightAttendant("Jane Doe", new Date(1977-5-3), "0729622232", 3000);
        FlightAttendant flightAttendantTwo = new FlightAttendant("Janet Doe", new Date(1989-12-13), "0729354633", 2800);
        FlightAttendant flightAttendantThree = new FlightAttendant("Joanna Doe", new Date(1992-6-23), "0729697534", 3200);

        flightOne.addFlightAttendant(flightAttendantOne);
        flightOne.addFlightAttendant(flightAttendantTwo);
        flightOne.addFlightAttendant(flightAttendantThree);

        System.out.println("First flight attendant speaks: " + flightAttendantOne.getLanguage1() + ", " + flightAttendantOne.getLanguage2() + ", " + flightAttendantOne.getLanguage3() + ".");
        System.out.println("Second flight attendant speaks: " + flightAttendantTwo.getLanguage1() + ", " + flightAttendantTwo.getLanguage2() + ", " + flightAttendantTwo.getLanguage3() + ".");
        System.out.println("Third flight attendant speaks: " + flightAttendantThree.getLanguage1() + ", " + flightAttendantThree.getLanguage2() + ", " + flightAttendantThree.getLanguage3() + ".");

        System.out.println("Team complete for flight with id " + flightOne.id);

        System.out.println(flightOne.numberPassengers + " passengers on the flight");

        System.out.println("Checking if flight is ready to take off...");

        if (captainOne.hasCompass() && copilotOne.hasCompass()) {
            System.out.println("Both pilots have compass");
        } else {
            System.out.println("One or both of the pilots don't have compass");
        }

        if (flightOne.checkLanguage(flightAttendantOne)) {
            System.out.println("First flight attendant speaks the language of the flight");
        } else {
            System.out.println("First flight attendant doesn't speak the language of the flight");
        }

        if (flightOne.checkLanguage(flightAttendantTwo)) {
            System.out.println("Second flight attendant speaks the language of the flight");
        } else {
            System.out.println("Second flight attendant doesn't speak the language of the flight");
        }

        if (flightOne.checkLanguage(flightAttendantThree)) {
            System.out.println("Third flight attendant speaks the language of the flight");
        } else {
            System.out.println("Third flight attendant doesn't speak the language of the flight");
        }

        if (flightOne.checkIfFlightReady(flightOne.pilotsList, flightOne.flightAttendantsList)) {
            System.out.println("Flight checks passed");
        } else {
            System.out.println("Flight checks failed");
        }

    }

}
