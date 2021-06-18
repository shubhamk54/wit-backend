package com.wit.user.manager.mapper;

import com.wit.user.manager.model.DonarProductMapping;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DonarProductMapper implements RowMapper<DonarProductMapping> {
    @Override
    public DonarProductMapping mapRow(ResultSet rs, int rowNum) throws SQLException {
        DonarProductMapping donarProductMapping = new DonarProductMapping();

        donarProductMapping.setUserId(rs.getInt("user_id"));
        donarProductMapping.setEmailId(rs.getString("email"));
        donarProductMapping.setCity(rs.getString("city"));
        donarProductMapping.setCountry(rs.getString("country"));
        donarProductMapping.setFirstName(rs.getString("first_name"));
        donarProductMapping.setLastName(rs.getString("last_name"));
        donarProductMapping.setStreetAddress(rs.getString("street_address"));
        donarProductMapping.setZipCode(rs.getString("zip_code"));
        donarProductMapping.setPhoneNumber(rs.getString("phone_number"));
        donarProductMapping.setState(rs.getString("state"));

        donarProductMapping.setProductId(rs.getInt("product_id"));
        donarProductMapping.setProductName(rs.getString("product_name"));
        donarProductMapping.setProductType(rs.getString("type"));

        donarProductMapping.setExpiryDate(rs.getDate("expiry_date"));
        donarProductMapping.setManufacturerName(rs.getString("maf_name"));
        donarProductMapping.setQuantity(rs.getInt("quantity"));
        donarProductMapping.setImage(rs.getString("image"));
        donarProductMapping.setIsWorking(rs.getInt("is_working"));
        donarProductMapping.setCategory(rs.getString("category"));
        return donarProductMapping;
    }
}
