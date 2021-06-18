package com.wit.user.manager.controller;

import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.model.DonarProductMapping;
import com.wit.user.manager.model.Product;
import com.wit.user.manager.model.ProductDetails;
import com.wit.user.manager.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductManagementController {
    @Autowired
    UserManagerService userManagerservice;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts() throws ApiException {
        List<Product> list = userManagerservice.getAllProducts();
        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/details")
    public ResponseEntity<List<ProductDetails>> getAllProductDetails() throws ApiException {
        List<ProductDetails> list = userManagerservice.getAllProductDetails();
        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/details/{name}")
    public ResponseEntity<List<ProductDetails>> getProductsUsingName(@PathVariable String name) throws ApiException {
        List<ProductDetails> list = userManagerservice.getProductsUsingName(name);
        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/details/{type}")
    public ResponseEntity<List<ProductDetails>> getProductsUsingType(@PathVariable String type) throws ApiException {
        List<ProductDetails> list = userManagerservice.getProductsUsingType(type);
        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/details/{category}")
    public ResponseEntity<List<ProductDetails>> getProductsUsingCategory(@PathVariable String category) throws ApiException {
        List<ProductDetails> list = userManagerservice.getProductsUsingCategory(category);
        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/details/{userId}/{productId}")
    public ResponseEntity<List<DonarProductMapping>> getUserProductMapping(@PathVariable String userId,@PathVariable String productId) throws ApiException {
        List<DonarProductMapping> list = userManagerservice.getUserProductMapping(userId,productId);
        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }


}
