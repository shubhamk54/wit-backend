package com.wit.user.manager.mapper;

import com.wit.user.manager.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductId(rs.getString("prod_id"));
        product.setProductName(rs.getString("prod_name"));
        return product;
    }

}
