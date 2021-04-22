package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {

        Flight flight = new Flight("X4532 B4", "Indigo", 100, 10);
        System.out.println(flight.getFlightNumber());
        System.out.println(flight.checkAvailability());
        System.out.println(flight.getFightDetails());
        flight.incrementBookingCounter();
        System.out.println(flight.getFightDetails());

    }
}
