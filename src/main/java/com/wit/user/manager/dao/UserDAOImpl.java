package com.wit.user.manager.dao;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.mapper.*;
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
    public Boolean saveProductUser(DonarProductMapping productUser) throws ApiException {
        Boolean result;
        try
        {
            result=Boolean.FALSE;
            insert(UserDaoConstants.CREATE_NEW_USER,
                    new Object[]{productUser.firstName,productUser.lastName, productUser.emailId,productUser.phoneNumber,productUser.streetAddress,productUser.city,productUser.state,productUser.zipCode,productUser.country });
            insert(UserDaoConstants.CREATE_NEW_PRODUCT,
                    new Object[]{productUser.productName,productUser.expiryDate, productUser.manufacturerName,productUser.quantity,productUser.productType, productUser.category});

            Integer userId =  queryForObject(UserDaoConstants.FETCH_USER_BY_USERID_MAX,new Object[]{productUser.firstName,productUser.lastName}, new ProductIdRowMapper());
            Integer productId = queryForObject(UserDaoConstants.FETCH_PRODUCT_BY_PRODUCTID_MAX,new Object[]{productUser.productName,productUser.manufacturerName}, new UserIdRowMapper());

            List<DonarProductMapping> mapping = queryForParams(UserDaoConstants.FETCH_USER_PRODUCT_BYID,
                    new Object[]{userId, productId}, new DonarProductMapper());

            if(mapping!=null && !mapping.isEmpty())
            {
                result=Boolean.TRUE;
            }
        }
        catch (Exception e)
        {
            return Boolean.FALSE;
        }
        return result;
    }

    @Override
    public List<DonarProductMapping> getUserProductMapping(String userId, String productId) throws ApiException {
        return queryForParams(UserDaoConstants.FETCH_USER_PRODUCT_BYID,new Object[]{userId, productId}, new DonarProductMapper());
    }

}
