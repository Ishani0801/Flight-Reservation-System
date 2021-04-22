package com.upgrad.frs;

public class Address {
    //Attributes
    String street;
    String city;
    String state;

    //Constructor
    Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    //Method to print the address details of the passenger
    String getAddressDetails() {
        return "Street: " + street + " City: " + city + " State: " + state;
    }

}
