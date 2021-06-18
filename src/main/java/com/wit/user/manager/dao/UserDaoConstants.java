package com.wit.user.manager.dao;

import java.util.Date;

public class UserDaoConstants {

    public static final String FETCH_PRODUCTS_QUERY = "select product_id, product_name, quantity from product";

    public static final String FETCH_ALL_PRODUCTDETAILS = "SELECT product_name,expiry_date,maf_name,quantity,product_id,image,type,is_working,category FROM product";
    public static final String FETCH_PRODUCTDETAILS_BYNAME= "SELECT product_name,expiry_date,maf_name,quantity,product_id,image,type,is_working,category FROM product where productName = ?";
    public static final String FETCH_PRODUCTDETAILS_BYTYPE = "SELECT product_name,expiry_date,maf_name,quantity,product_id,image,type,is_working,category FROM product where type = ?";

    public static final String FETCH_PRODUCTDETAILS_BYCATEGORY="SELECT product_name,expiry_date,maf_name,quantity,product_id,image,type,is_working,category FROM product WHERE category=?";

    private UserDaoConstants() {
    }
}