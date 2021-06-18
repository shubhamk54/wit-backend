package com.wit.user.manager.mapper;

import com.wit.user.manager.model.Product;
import com.wit.user.manager.model.ProductDetails;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDetailsRowMapper implements RowMapper<ProductDetails> {

    @Override
    public ProductDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        ProductDetails product = new ProductDetails();

        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));
        product.setProductType(rs.getString("type"));

        product.setExpiryDate(rs.getDate("expiry_date"));
        product.setManufacturerName(rs.getString("maf_name"));
        product.setQuantity(rs.getInt("quantity"));
        product.setImage(rs.getString("image"));
        product.setIsWorking(rs.getBoolean("is_working"));
        product.setCategory(rs.getString("category"));
        return product;
    }
}