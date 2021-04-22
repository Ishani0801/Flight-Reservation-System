package com.upgrad.frs;

public class Contact {

    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    //Method to print the contact details
    String getContactDetails() {
        return "Name: " + name + " Phone: " + phone + " Email: " + email;
    }
}
