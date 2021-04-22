package com.upgrad.frs;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public Flight(Flight flight) {
        this.flightNumber = flight.flightNumber;
        this.airline = flight.airline;
        this.capacity = flight.capacity;
        this.bookedSeats = flight.bookedSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFightDetails() {
        return "Flight number: " + getFlightNumber() + " Airline: " + getAirline()
                + " Capacity: " + getCapacity() + " Booked Seats: " + getBookedSeats();
    }

    // checks the availability of flight
    public boolean checkAvailability() {
        if (capacity == bookedSeats) {
            return false;
        }
        return true;
    }

    // increments the booking count as soon as a reservation is made.
    public void incrementBookingCounter() {
        bookedSeats++;
    }

    Flight (){

    }
}
