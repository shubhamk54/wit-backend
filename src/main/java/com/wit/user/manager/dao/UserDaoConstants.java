package com.wit.user.manager.dao;

import java.util.Date;

public class UserDaoConstants {

    public static final String FETCH_PRODUCTS_QUERY = "select product_id, product_name, quantity from product";

    public static final String FETCH_ALL_PRODUCTDETAILS = "SELECT product_name,expiry_date,manf_name,quantity,product_id,image,type,is_working,category FROM product";
    public static final String FETCH_PRODUCTDETAILS_BYNAME= "SELECT product_name,expiry_date,manf_name,quantity,product_id,image,type,is_working,category FROM product where productName = ?";
    public static final String FETCH_PRODUCTDETAILS_BYTYPE = "SELECT product_name,expiry_date,manf_name,quantity,product_id,image,type,is_working,category FROM product where type = ?";

    public static final String FETCH_PRODUCTDETAILS_BYCATEGORY="SELECT product_name,expiry_date,manf_name,quantity,product_id,image,type,is_working,category FROM product WHERE category=?";

    public static final String CREATE_NEW_USER = "INSERT INTO user_detail(first_name, last_name, email, phone_number,street_address, city, state,zip_code, country) VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String CREATE_NEW_PRODUCT = "INSERT INTO product(product_name, expiry_date, manf_name, quantity, type) VALUES(?, ?, ?, ?, ?)";

    public static final String FETCH_USER_BY_USERID="SELECT user_id FROM user_detail WHERE first_name=? AND last_name=?";
    public static final String FETCH_PRODUCT_BY_PRODUCTID="SELECT product_id FROM product WHERE product_name=? AND manf_name=?";

    public static final String FETCH_USER_BY_USERID_MAX="SELECT MAX(user_id) FROM user_detail WHERE first_name=? AND last_name=? ";
    public static final String FETCH_PRODUCT_BY_PRODUCTID_MAX="SELECT MAX(product_id) FROM product WHERE product_name=? AND manf_name=?";

    public static final String FETCH_USER_PRODUCT_BYID ="SELECT product_name,expiry_date,manf_name,quantity,product_id,image,type,is_working,category," +
            "first_name, last_name, email, phone_number,street_address, city, state,zip_code, country " +
            "FROM product,user_detail where user_id=? and product_id=? ";

    private UserDaoConstants() {
    }
}