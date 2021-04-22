package com.upgrad.frs;

import java.util.Arrays;

public class TouristTicket {
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
    String hotelAddress;
    String[] selectedTouristLocation = new String[5]; //Maximum 5 tourist locations can be selected.

    public TouristTicket(String pnr, String from, String to, String departureDate, String arrivalDate,
                         int departureTime, int arrivalTime, String seatNumber,
                         float price, boolean cancelled, String hotelAddress, String[] selectedTouristLocation) {
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
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
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

    String getHotelAddress() {
        return "Hotel address is: " + hotelAddress;
    }

    String getTouristLocation() {
        return "Tourist locations are: " + Arrays.toString(selectedTouristLocation);
    }

    //adds a tourist location in the array of tourist locations selected by the passenger.
    void addTouristLocation(String location) {
        for (int i = 0; i < selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == null) {
                selectedTouristLocation[i] = location;
            }
        }
    }

    //removes a tourist location from the array of tourist locations selected by the passenger.
    void removeTouristLocation(String location) {
        for (int i = 0; i < selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == location) {
                selectedTouristLocation[i] = null;
            }
        }
    }

}
