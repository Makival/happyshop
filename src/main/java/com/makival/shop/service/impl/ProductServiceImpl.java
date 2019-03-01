package com.makival.shop.service.impl;

import com.makival.shop.domain.bean.Product;
import com.makival.shop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kiryl Karatkevich
 * @since February 22, 2019
 */
public class ProductServiceImpl implements ProductService {

    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

    public List<Product> getProducts() {
        LOG.info("Product list call from ProductServiceImpl");
        return new ArrayList<>() ;
    }

    public Product getProductById(long productId) {
        return null;
    }
}
