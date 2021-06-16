package com.wit.user.manager.controller;

import com.wit.user.manager.exception.ApiException;
import com.wit.user.manager.model.Product;
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

}
