package com.makival.shop.api.product.controller;

import com.makival.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Kiryl Karatkevich
 * @since February 22, 2019
 */
@Controller
@RequestMapping(value="/store")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getProducts() {

        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);

    }


}
