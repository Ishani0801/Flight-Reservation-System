package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {
            Passenger passenger = new Passenger();
            Flight flight = new Flight();
            RegularTicket regularTicket = new RegularTicket("123456", "Bhopal", "Delhi",
                    "19/05/2021", "19/05/2021", "12.00", "6.00",
                    "12A", 7500, false, passenger, flight, "Food, Snacks and Water");
        System.out.println(regularTicket.checkStatus());
        System.out.println(regularTicket.getArrivalDate());
    }
}
