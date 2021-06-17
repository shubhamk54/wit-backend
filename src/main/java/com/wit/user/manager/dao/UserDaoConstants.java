package com.wit.user.manager.dao;

import java.util.Date;

public class UserDaoConstants {

    public static final String FETCH_PRODUCTS_QUERY = "select prod_id, prod_name, qty from product";

    public static final String FETCH_ALL_PRODUCTDETAILS = "SELECT productName,expiryDate,manufacturerName,quantity,productId,image,type,isWorking FROM ProductDetails";
    public static final String FETCH_PRODUCTDETAILS_BYNAME= "SELECT productName,expiryDate,manufacturerName,quantity,productId,image,type,isWorking FROM ProductDetails where productName = '{0}'";
    public static final String FETCH_PRODUCTDETAILS_BYTYPE = "SELECT productName,expiryDate,manufacturerName,quantity,productId,image,type,isWorking FROM ProductDetails where type = '{0}'";

    private UserDaoConstants() {
    }
}