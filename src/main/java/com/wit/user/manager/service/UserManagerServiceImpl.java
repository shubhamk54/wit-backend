package com.wit.user.manager.service;

import com.wit.user.manager.dao.UserDAO;
import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.model.Product;
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
}
