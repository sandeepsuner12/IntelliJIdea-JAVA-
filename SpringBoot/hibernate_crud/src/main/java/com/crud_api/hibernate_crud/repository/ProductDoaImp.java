package com.crud_api.hibernate_crud.repository;

import com.crud_api.hibernate_crud.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDoaImp implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public Product findByName(String name) {
        return (Product)  this.sessionFactory.openSession()
                .createQuery("from Product p where p.name=\""+name+"\"")
//                .setParameter("name" , name)
                .getSingleResult();
    }
}
