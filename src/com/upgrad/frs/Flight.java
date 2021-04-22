package com.upgrad.frs;

public class Flight {
    String flightNumber;
    String airline;
    int capacity;
    int bookedSeats;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    String getFightDetails() {
        return "Flight number: " + flightNumber + " Airline: " + airline
                + " Capacity: " + capacity + " Booked Seats: " + bookedSeats;
    }

    // checks the availability of flight
    boolean checkAvailability() {
        if (capacity == bookedSeats) {
            return false;
        }
        return true;
    }
    // increments the booking count as soon as a reservation is made.
    void incrementBookingCounter() {
        bookedSeats++;
    }
}
