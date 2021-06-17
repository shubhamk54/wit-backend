package com.wit.user.manager.model;

import lombok.Data;
import java.util.Date;


@Data
public class ProductDetails{
    public String productName;
    public Date expiryDate;
    public String manufacturerName;
    public int quantity;
    public int productId;
    public String image;
    public String productType;
    public Boolean isWorking;
    public String category;
}
