package com.wit.user.manager.dao;

import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.mapper.ProductDetailsRowMapper;
import com.wit.user.manager.mapper.ProductRowMapper;
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
        return queryForList(UserDaoConstants.FETCH_PRODUCTDETAILS_BYNAME, new ProductDetailsRowMapper());
    }
    @Override
    public List<ProductDetails> getProductsUsingType(String type) throws ApiException {
        return queryForList(UserDaoConstants.FETCH_PRODUCTDETAILS_BYTYPE, new ProductDetailsRowMapper());
    }
}
