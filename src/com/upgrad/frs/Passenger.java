package com.upgrad.frs;

public class Passenger {
    private static int idCounter;

    private int id;

    Address address;
    Contact contact;


    public Passenger(int id, String addressStreet, String addressCity,
                     String addressState, String contactName, String contactPhone,
                     String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    public Passenger(Passenger passenger) {
        this.address = passenger.address;
        this.contact = passenger.contact;
        this.id = passenger.id;
    }

    //Address and contact class nested inside Passenger class showing composition.
    private static class Address {

        private String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public Address(Address address) {
            this.street = address.street;
            this.city = address.city;
            this.state = address.state;
        }

        //Method to print the address details of the passenger
        public String getAddressDetails() {
            return "Street: " + getStreet() + " City: " + getCity() + " State: " + getState();
        }

        //getters and setters for private attributes of Address class
        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    private static class Contact {

        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public Contact(Contact contact) {
            this.name = contact.name;
            this.phone = contact.phone;
            this.email = contact.email;
        }

        //Method to print the contact details
        public String getContactDetails() {
            return "Name: " + getName() + " Phone: " + getPhone() + " Email: " + getEmail();
        }

        //getters and setters for private attributes of Contact class
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    //provides the count of passenger by returning the no. of passenger objects created inside the system
    public int getPassengerCount() {
        return idCounter;
    }


}
