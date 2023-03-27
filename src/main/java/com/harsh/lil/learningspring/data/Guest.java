package com.harsh.lil.learningspring.data;

import jakarta.persistence.*;

@Entity
@Table(name = "GUEST")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name ="GUEST_ID")
    private long guestID;
    @Column(name ="FIRST_NAME")
    private  String firstName;
    @Column(name = "LAST_NAME")
    private String LastName;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "ADDRESS")
    private  String Address;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "STATE")
    private String state;
    @Column(name = "PHONE_NUMBER")
    private String phone_Number;

    public long getGuestID() {
        return guestID;
    }

    public void setGuestID(long guestID) {
        this.guestID = guestID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestID=" + guestID +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", Address='" + Address + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", phone_Number='" + phone_Number + '\'' +
                '}';
    }
}
