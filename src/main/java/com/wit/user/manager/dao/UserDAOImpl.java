package com.wit.user.manager.dao;

import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.mapper.DonarProductMapper;
import com.wit.user.manager.mapper.ProductDetailsRowMapper;
import com.wit.user.manager.mapper.ProductRowMapper;
import com.wit.user.manager.model.DonarProductMapping;
import com.wit.user.manager.model.Product;
import com.wit.user.manager.model.ProductDetails;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Transactional
@Repository
public class UserDAOImpl extends CapitalDaoSupport implements UserDAO {

    public UserDAOImpl(DataSource datasource) {
        super(datasource);
    }

    @Override
    public List<Product> getAllProducts() throws ApiException {
        return queryForList(UserDaoConstants.FETCH_PRODUCTS_QUERY, new ProductRowMapper());
    }

    @Override
    public List<ProductDetails> getAllProductDetails() throws ApiException {
        return queryForList(UserDaoConstants.FETCH_ALL_PRODUCTDETAILS, new ProductDetailsRowMapper());
    }

    @Override
    public List<ProductDetails> getProductsUsingName(String productName) throws ApiException {
        return queryForParams(UserDaoConstants.FETCH_PRODUCTDETAILS_BYNAME,new Object[]{productName}, new ProductDetailsRowMapper());
    }

    @Override
    public List<ProductDetails> getProductsUsingType(String type) throws ApiException {
        return queryForParams(UserDaoConstants.FETCH_PRODUCTDETAILS_BYTYPE,new Object[]{type}, new ProductDetailsRowMapper());
    }

    @Override
    public List<ProductDetails> getProductsUsingCategory(String category) throws ApiException {
        return queryForParams(UserDaoConstants.FETCH_PRODUCTDETAILS_BYCATEGORY,new Object[]{category}, new ProductDetailsRowMapper());
    }

    @Override
    public Boolean saveProduct(ProductDetails product) {
        //insert(UserDaoConstants.INSERT_PRODUCT_QUERY,new Object[]{product});
        // @TODO: Added query
        return null;
    }

    @Override
    public List<DonarProductMapping> getUserProductMapping(String userId, String productId) throws ApiException {
        return queryForParams(UserDaoConstants.FETCH_USER_PRODUCT_BYID,new Object[]{userId, productId}, new DonarProductMapper());
    }

}
