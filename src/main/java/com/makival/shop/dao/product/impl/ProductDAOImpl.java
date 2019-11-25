package com.makival.shop.dao.product.impl;

import com.makival.shop.dao.AbstractDAO;
import com.makival.shop.dao.product.ProductDAO;
import com.makival.shop.domain.bean.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl extends AbstractDAO implements ProductDAO {

    @Override
    public List<Product> getProducts() {
        SessionFactory factory = getSessionFactory();
        Session session = factory.openSession();
        List<Product> products = session.createQuery("FROM Product")
                .getResultList();
        session.close();
        return products;
    }

    @Override
    public Product getProductById(long productId) {
        return null;
    }

}
