package com.company;

public class Address {
    private String city;
    private String street;
    private int house;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return  "Город - " + city + '\n' + "Улица - " + street + '\n' + "Дом - " + house;
    }

    public Address(String city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }
}
