package com.makival.shop.service;

import com.makival.shop.domain.bean.Product;

import java.util.List;

/**
 * @author Kiryl Karatkevich
 * @since February 12, 2019
 */
public interface ProductService {

    List<Product> getProducts();

    Product getProductById(long productId);

}
