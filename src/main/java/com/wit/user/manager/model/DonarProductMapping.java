package com.wit.user.manager.model;

import lombok.Data;

@Data
public class DonarProductMapping {
    private int userId;
    private int productId;
    private boolean isAvailable;
    private int donationId;
}