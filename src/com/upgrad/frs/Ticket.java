package com.upgrad.frs;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureDate;
    private String arrivalDate;
    private String departureTime;
    private String arrivalTime;
    private String seatNumber;
    private float price;
    private boolean cancelled;
    private Passenger passenger;
    private Flight flight;

    public Ticket(String pnr, String from, String to, String departureDate,
                  String arrivalDate, String departureTime, String arrivalTime,
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
        int arrival = Integer.parseInt(arrivalTime);
        int departure = Integer.parseInt(departureTime);
        if (arrival > departure) {
            return arrival - departure;
        }
        return departure - arrival;
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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
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
