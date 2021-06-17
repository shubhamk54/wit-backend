package com.wit.user.manager.service;

import com.wit.user.manager.dao.UserDAO;
import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.model.Product;
import com.wit.user.manager.model.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagerServiceImpl implements UserManagerService {

    @Autowired
    UserDAO userDao;


    @Override
    public List<Product> getAllProducts() throws ApiException {
        return userDao.getAllProducts();
    }
    @Override
    public List<ProductDetails> getAllProductDetails() throws ApiException{
        return userDao.getAllProductDetails();
    }
    @Override
    public List<ProductDetails> getProductsUsingName(String productName) throws ApiException{
        return userDao.getProductsUsingName(productName);
    }
    @Override
    public List<ProductDetails> getProductsUsingType(String type) throws ApiException{
        return userDao.getProductsUsingType(type);
    }
}
