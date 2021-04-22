package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {
        /* Object declaration, instantiation and initialization of all the classes
        followed by accessing their attributes and methods and printing them on console  */

        Address address = new Address("M.P. Nagar, Zone-II", "Bhopal", "Madhya Pradesh");
        System.out.println(address.street);
        System.out.println(address.getAddressDetails());

        Contact contact = new Contact("Ishani Tiwari", "1234567890", "ishanit.0801@gmail.com");
        System.out.println(contact.name);
        System.out.println(contact.getContactDetails());

        Passenger passenger = new Passenger(1);
        System.out.println(passenger.id);

        Flight flight = new Flight("X5432 A", "Indigo", 100, 1);
        System.out.println(flight.airline);
        System.out.println(flight.getFightDetails());

        Ticket ticket = new Ticket("123456", "Bhopal", "Delhi", "19/05/21", "19/05/21",
                1200, 600, "12A", 7500, false);
        System.out.println(ticket.seatNumber);
        System.out.println(ticket.checkStatus());

        RegularTicket regularTicket = new RegularTicket("123456", "Bhopal", "Delhi", "19/05/21",
                "19/05/21", 1200, 600, "12A", 7500, false,
                "Food, water, snacks");
        System.out.println(regularTicket.seatNumber);
        System.out.println(regularTicket.getSpecialServices());

        TouristTicket touristTicket = new TouristTicket("123456", "Bhopal", "Delhi", "19/05/21",
                "19/05/21", 1200, 600, "12A", 7500, false,
                "Hotel Courtyard, M.P. Nagar, Zone - I", new String[]{"Bhojpur", "Sanchi", "Satpura Tiger Reserve"});
        System.out.println(touristTicket.hotelAddress);
        System.out.println(touristTicket.getTouristLocation());
    }
}
