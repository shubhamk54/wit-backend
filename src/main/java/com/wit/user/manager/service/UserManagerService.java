package com.wit.user.manager.service;

import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.model.Product;

import java.util.List;

public interface UserManagerService {

    List<Product> getAllProducts() throws ApiException;

}
