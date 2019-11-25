package com.makival.shop.dao.product;

import com.makival.shop.domain.bean.Product;

import java.util.List;

public interface ProductDAO {

    List<Product> getProducts();

    Product getProductById(long productId);

}
