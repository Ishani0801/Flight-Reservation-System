package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        Flight flight = new Flight();

        RegularTicket ticket1 = new RegularTicket("123456", "Bhopal", "Delhi",
                "19/05/2021", "19/05/2021", "12.00", "6.00",
                "12A", 7500, false, passenger, flight, "Food, Snacks and Water");

        TouristTicket ticket2 = new TouristTicket("987654321", "Bhopal", "Delhi",
                "19/05/2021", "19/05/2021", "12.00", "6.00",
                "12A", 7500, false, passenger, flight, "Hotel Courtyard, M.P. Nagar, Zone - I",
                new String[]{"Bhojpur", "Sanchi"});

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);
       
    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println("PNR number of the ticket is: "+ticket.getPnr());
    }
}
