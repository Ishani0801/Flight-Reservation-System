package com.upgrad.frs;

import java.util.Arrays;

public class TouristTicket extends Ticket {

    private String hotelAddress;
    private String[] selectedTouristLocation = new String[5]; //Maximum 5 tourist locations can be selected.


    public TouristTicket(String pnr, String from, String to, String departureDate,
                         String arrivalDate, String departureTime, String arrivalTime,
                         String seatNumber, float price, boolean cancelled, Passenger passenger, Flight flight,
                         String hotelAddress, String[] selectedTouristLocation) {
        super(pnr, from, to, departureDate,
                arrivalDate, departureTime, arrivalTime,
        seatNumber, price, cancelled, passenger, flight);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;

    }

    public String getHotelAddress() {
        return "Hotel address is: " + hotelAddress;
    }

    public String getTouristLocation() {
        return "Tourist locations are: " + Arrays.toString(selectedTouristLocation);
    }

    //adds a tourist location in the array of tourist locations selected by the passenger.
    public void addTouristLocation(String location) {
        for (int i = 0; i < selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == null) {
                selectedTouristLocation[i] = location;
            }
        }
    }

    //removes a tourist location from the array of tourist locations selected by the passenger.
    public void removeTouristLocation(String location) {
        for (int i = 0; i < selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == location) {
                selectedTouristLocation[i] = null;
            }
        }
    }


    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
}
