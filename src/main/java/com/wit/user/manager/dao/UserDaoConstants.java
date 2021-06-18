package com.wit.user.manager.dao;

import java.util.Date;

public class UserDaoConstants {

    public static final String FETCH_PRODUCTS_QUERY = "select product_id, product_name, quantity from product";

    public static final String FETCH_ALL_PRODUCTDETAILS = "SELECT product_name,expiry_date,maf_name,quantity,product_id,image,type,is_working,category FROM product";
    public static final String FETCH_PRODUCTDETAILS_BYNAME= "SELECT product_name,expiry_date,maf_name,quantity,product_id,image,type,is_working,category FROM product where productName = ?";
    public static final String FETCH_PRODUCTDETAILS_BYTYPE = "SELECT product_name,expiry_date,maf_name,quantity,product_id,image,type,is_working,category FROM product where type = ?";

    public static final String FETCH_PRODUCTDETAILS_BYCATEGORY="SELECT product_name,expiry_date,maf_name,quantity,product_id,image,type,is_working,category FROM product WHERE category=?";

    public static final String CREATE_NEW_USER = "INSERT INTO user_detail(first_name, last_name, email, phone_number,street_address, city, state,zip_code, country) VALUES('{0}', '{1}','{2}', '{3}','{4}', '{5}', '{6}','{7}', '{8}');";
    public static final String CREATE_NEW_PRODUCT = "INSERT INTO product(product_name, expiry_date, manf_name, quantity, type) VALUES('{0}', '{1}','{2}', {3}}, '{4}')";

    public static final String FETCH_USER_BY_USERID="SELECT user_id FROM user_detail WHERE first_name='{0}' AND last_name='{1}'";
    public static final String FETCH_PRODUCT_BY_PRODUCTID="SELECT product_id FROM product WHERE product_name='{0}' AND maf_name='{1}'";

    public static final String FETCH_USER_BY_USERID_MAX="SELECT MAX(user_id) FROM user_detail WHERE first_name='{0}' AND last_name='{1}'";
    public static final String FETCH_PRODUCT_BY_PRODUCTID_MAX="SELECT MAX(product_id) FROM product WHERE product_name='{0}' AND maf_name='{1}'";

    public static final String FETCH_USER_PRODUCT_BYID ="SELECT product_name,expiry_date,maf_name,quantity,product_id,image,type,is_working,category," +
            "first_name, last_name, email, phone_number,street_address, city, state,zip_code, country " +
            "FROM product,user_detail where product_id={0} and user_id={1}";

    private UserDaoConstants() {
    }
}