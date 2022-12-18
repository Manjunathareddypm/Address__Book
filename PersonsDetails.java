package com.Address_Book;

import java.util.ArrayList;
import java.util.*;

  class PersonsDetails {
    private String firstName, lastName, address, city, state, emailId;
    private long zipCode;
    private long phoneNumber;
    public PersonsDetails(String firstName, String lastName, String address, String city, String state, String emailId, long zipCode, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.emailId = emailId;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getemailId() {
        return emailId;
    }

    public void setemailId(String emailId) {
        this.emailId = emailId;
    }

    public long getzipCode() {
        return zipCode;
    }

    public void setzipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}







