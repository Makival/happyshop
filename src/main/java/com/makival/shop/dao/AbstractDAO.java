package com.makival.shop.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;

public class AbstractDAO {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    protected SessionFactory getSessionFactory() {
        return entityManagerFactory.unwrap(SessionFactory.class);
    }
}
