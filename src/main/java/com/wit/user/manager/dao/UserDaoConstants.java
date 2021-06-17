package com.wit.user.manager.dao;

import java.util.Date;

public class UserDaoConstants {

    public static final String FETCH_PRODUCTS_QUERY = "select prod_id, prod_name, qty from product";

    public static final String FETCH_ALL_PRODUCTDETAILS = "SELECT productName,expiryDate,manufacturerName,quantity,productId,image,productType,isWorking FROM ProductDetails";
    public static final String FETCH_PRODUCTDETAILS_BYNAME= "SELECT productName,expiryDate,manufacturerName,quantity,productId,image,productType,isWorking FROM ProductDetails where productName = ?";
    public static final String FETCH_PRODUCTDETAILS_BYTYPE = "SELECT productName,expiryDate,manufacturerName,quantity,productId,image,productType,isWorking FROM ProductDetails where type = ?";

    public static final String FETCH_PRODUCTDETAILS_BYCATEGORY="SELECT productName, expiryDate, manufacturerName, quantity, productType, category FROM DonatedProducts WHERE category=?";

    private UserDaoConstants() {
    }
}