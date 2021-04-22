package com.upgrad.frs;

public class RegularTicket extends Ticket {
    private String specialServices;

    public RegularTicket(String pnr, String from, String to, String departureDate,
                         String arrivalDate, String departureTime, String arrivalTime,
                         String seatNumber, float price, boolean cancelled, Passenger passenger,
                         Flight flight, String specialServices) {
        super(pnr, from, to, departureDate,
                arrivalDate, departureTime, arrivalTime,
                seatNumber, price, cancelled, passenger, flight);
        this.specialServices = specialServices;
    }


    //lists the special services opted by the passenger.
    public String getSpecialServices() {
        return "Special services are: " + specialServices;
    }


    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
