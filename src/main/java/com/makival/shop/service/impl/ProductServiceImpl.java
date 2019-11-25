package com.makival.shop.service.impl;

import com.makival.shop.dao.product.ProductDAO;
import com.makival.shop.domain.bean.Product;
import com.makival.shop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kiryl Karatkevich
 * @since February 22, 2019
 */
@Service
public class ProductServiceImpl implements ProductService {
    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductDAO productDAO;

    public List<Product> getProducts() {
        LOG.info("Product list call from ProductServiceImpl");
        return productDAO.getProducts();
    }

    public Product getProductById(long productId) {
        return null;
    }
}
