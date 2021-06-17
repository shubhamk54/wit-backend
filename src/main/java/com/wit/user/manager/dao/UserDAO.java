package com.wit.user.manager.dao;

import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.model.Product;
import com.wit.user.manager.model.ProductDetails;

import java.util.List;

public interface UserDAO {
    List<Product> getAllProducts() throws ApiException;

    List<ProductDetails> getAllProductDetails() throws ApiException;

    List<ProductDetails> getProductsUsingName(String productName) throws ApiException;

    List<ProductDetails> getProductsUsingType(String type) throws ApiException;

    List<ProductDetails> getProductsUsingCategory(String category) throws ApiException;
}
