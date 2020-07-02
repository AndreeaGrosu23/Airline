package com.andreeagrosu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Flight {

    int id;
    Languages language;
    static int counter=0;

    Pilot pilot = null;
    List<Pilot> pilotsList = null;
    int numberPilots = 2;
    FlightAttendant flightAttendant = null;
    List<FlightAttendant> flightAttendantsList = null;
    int numberFlightAttendants = 3;

    int numberPassengers;
    Random random = new Random();
    static int minPassengers=100;
    static int maxPassengers=250;

    public Flight() {
        counter++;
        this.id = counter;
        this.language = Languages.values()[(int)(Math.random()*Languages.values().length)];
        this.numberPassengers = minPassengers + (int)(random.nextFloat()*(maxPassengers-minPassengers));
    }

    public List<Pilot> addPilot(Pilot pilot) {
        if (pilotsList == null) {
            pilotsList = new ArrayList<Pilot>();
            pilotsList.add(pilot);
            System.out.println("Pilot added.");
        } else if (pilotsList.size()<numberPilots) {
            pilotsList.add(pilot);
            System.out.println("Pilot added.");
        } else {
            System.out.println("No more pilots needed.");
        }
        return pilotsList;
    }

    public List<FlightAttendant> addFlightAttendant(FlightAttendant flightAttendant) {
        if (flightAttendantsList==null) {
            flightAttendantsList = new ArrayList<FlightAttendant>();
            flightAttendantsList.add(flightAttendant);
            System.out.println("Flight Attendant added.");
        } else if (flightAttendantsList.size()<numberFlightAttendants) {
            flightAttendantsList.add(flightAttendant);
            System.out.println("Flight Attendant added.");
        } else {
            System.out.println("No more flight attendants needed.");
        }
        return flightAttendantsList;
    }

    public boolean checkLanguage(FlightAttendant flightAttendant) {
        if (flightAttendant.getLanguage1()==language || flightAttendant.getLanguage2()==language || flightAttendant.getLanguage3()==language) {
            return true;
        } else {
//            System.out.println("Not all flight attendants speak the flight language");
            return false;
        }

    }

    public boolean checkIfFlightReady(List<Pilot> pilotsList, List<FlightAttendant> flightAttendantsList) {
        if (pilotsList.get(0).hasCompass() && pilotsList.get(1).hasCompass() && numberPassengers<220 && checkLanguage(flightAttendantsList.get(0)) && checkLanguage(flightAttendantsList.get(1)) && checkLanguage(flightAttendantsList.get(2))) {
            System.out.println("Flight ready to take off");
            return true;
        } else {
            System.out.println("Flight not ready to take off");
            return false;
        }
    }

}
