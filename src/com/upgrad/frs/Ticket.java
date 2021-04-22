package com.upgrad.frs;

public class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureDate;
    private String arrivalDate;
    private int departureTime;
    private int arrivalTime;
    private String seatNumber;
    private float price;
    private boolean cancelled;
    Passenger passenger;
    Flight flight;

    public Ticket(String pnr, String from, String to, String departureDate,
                  String arrivalDate, int departureTime, int arrivalTime,
                  String seatNumber, float price, boolean cancelled, Passenger passenger, Flight flight) {
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
        this.passenger = passenger;
        this.flight = flight;
    }

    public String checkStatus() {
        if (cancelled == true) {
            return "Cancelled";
        }
        return "Confirmed";
    }

    //gives the duration of flight in 2400 Hrs. Format
    public int getFlightDuration() {
        if (arrivalTime > departureTime) {
            return arrivalTime - departureTime;
        }
        return departureTime - arrivalTime;
    }

    public void cancel() {
        cancelled = true;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
