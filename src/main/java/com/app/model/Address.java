package com.app.model;

public class Address {
    long id;
    String country;
    String city;
    String street;
    String homeNr;
    String apartmentNr;
    int floor;
    String postCode;
    String doorPin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNr() {
        return homeNr;
    }

    public void setHomeNr(String homeNr) {
        this.homeNr = homeNr;
    }

    public String getApartmentNr() {
        return apartmentNr;
    }

    public void setApartmentNr(String apartmentNr) {
        this.apartmentNr = apartmentNr;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getDoorPin() {
        return doorPin;
    }

    public void setDoorPin(String doorPin) {
        this.doorPin = doorPin;
    }
}
