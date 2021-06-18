package com.wit.user.manager.model;

import lombok.Data;

@Data
public class DonarDetails {
    public String firstName;
    public String lastName;
    public String emailId;
    public String phoneNumber;
    public String streetAddress;
    public String zipCode;
    public String city;
    public String state;
    public String country;
    public int userId;
}
