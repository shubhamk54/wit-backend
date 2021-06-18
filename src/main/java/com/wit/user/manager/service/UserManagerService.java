package com.wit.user.manager.service;

import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.model.DonarProductMapping;
import com.wit.user.manager.model.Product;
import com.wit.user.manager.model.ProductDetails;

import java.util.List;

public interface UserManagerService {

    List<Product> getAllProducts() throws ApiException;

    List<ProductDetails> getAllProductDetails() throws ApiException;

    List<ProductDetails> getProductsUsingName(String name) throws ApiException;

    List<ProductDetails> getProductsUsingType(String type) throws ApiException;

    List<ProductDetails> getProductsUsingCategory(String category) throws ApiException;

    Boolean saveProductUser(DonarProductMapping productUser) throws ApiException;
    List<DonarProductMapping> getUserProductMapping(String userId, String productId)throws ApiException;
}
