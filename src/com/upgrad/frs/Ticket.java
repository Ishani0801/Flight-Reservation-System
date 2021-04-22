package com.upgrad.frs;

public class Ticket {
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

    public Ticket(String pnr, String from, String to, String departureDate,
                  String arrivalDate, int departureTime, int arrivalTime,
                  String seatNumber, float price, boolean cancelled) {
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
    }

    String checkStatus() {
        if (cancelled == true) {
            return "Cancelled";
        }
        return "Confirmed";
    }

    //gives the duration of flight in 2400 Hrs. Format
    int getFlightDuration() {
        if (arrivalTime > departureTime) {
            return arrivalTime - departureTime;
        }
        return departureTime - arrivalTime;
    }

    void cancel() {
        cancelled = true;
    }
}
