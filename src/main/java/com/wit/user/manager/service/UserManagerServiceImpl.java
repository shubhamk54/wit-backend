package com.wit.user.manager.service;

import com.wit.user.manager.dao.UserDAO;
import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.model.DonarProductMapping;
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

    @Override
    public List<ProductDetails> getProductsUsingCategory(String category) throws ApiException{
        return userDao.getProductsUsingType(category);
    }

    @Override
    public Boolean saveProductUser(DonarProductMapping productUser) throws ApiException{
        return userDao.saveProductUser(productUser);
    }

//    @Override
//    public List<ProductDetails> getDonarProductMapping(String userId, String productId) throws ApiException{
//        return userDao.getProductsUsingType(category);
//    }

    @Override
    public List<DonarProductMapping> getUserProductMapping(String userId, String productId) throws ApiException
    {
        return userDao.getUserProductMapping(userId, productId);
    }
}
