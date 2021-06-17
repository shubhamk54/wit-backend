package com.wit.user.manager.mapper;

        import com.wit.user.manager.model.ProductDetails;
        import org.springframework.jdbc.core.RowMapper;

        import java.sql.ResultSet;
        import java.sql.SQLException;

public class ProductDetailsRowMapper implements RowMapper<ProductDetails> {

    @Override
    public ProductDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        ProductDetails product = new ProductDetails();

        product.setProductId(rs.getInt("productId"));
        product.setProductName(rs.getString("productName"));
        product.setType(rs.getString("type"));

        product.setExpiryDate(rs.getDate("expiryDate"));
        product.setManufacturerName(rs.getString("manufacturerName"));
        product.setQuantity(rs.getInt("quantity"));
        product.setImage(rs.getString("image"));
        product.setIsWorking(rs.getBoolean("isWorking"));
        return product;
    }
}