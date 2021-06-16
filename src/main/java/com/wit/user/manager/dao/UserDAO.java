package com.wit.user.manager.dao;

import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.model.Product;

import java.util.List;

public interface UserDAO {
    List<Product> getAllProducts() throws ApiException;

}
