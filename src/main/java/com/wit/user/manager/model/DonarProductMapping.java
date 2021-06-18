package com.wit.user.manager.model;

import lombok.Data;

import java.util.Date;

@Data
public class DonarProductMapping {

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

    public String productName;
    public Date expiryDate;
    public String manufacturerName;
    public int quantity;
    public int productId;
    public String image;
    public String productType;
    public int isWorking;
    public String category;
}