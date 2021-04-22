package com.upgrad.frs;

public class RegularTicket {
    String pnr;
    String from;
    String to;
    String departureDate;
    String arrivalDate;
    int departureTime;
    int arrivalTime;
    String seatNumber;
    float price;
    boolean cancelled;
    String specialServices;

    public RegularTicket(String pnr, String from, String to, String departureDate, String arrivalDate,
                         int departureTime, int arrivalTime, String seatNumber,
                         float price, boolean cancelled, String specialServices) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatNumber = seatNumber;
        this.price = price;
        this.cancelled = cancelled;
        this.specialServices = specialServices;
    }

    String checkStatus() {
        if (cancelled == true) {
            return "Cancelled";
        }
        return "Confirmed";
    }

    int getFlightDuration() {
        if (arrivalTime > departureTime) {
            return arrivalTime - departureTime;
        }
        return departureTime - arrivalTime;
    }

    void cancel() {
        cancelled = true;
    }

    //lists the special services opted by the passenger.
    String getSpecialServices() {
        return "Special services are: " + specialServices;
    }
}
