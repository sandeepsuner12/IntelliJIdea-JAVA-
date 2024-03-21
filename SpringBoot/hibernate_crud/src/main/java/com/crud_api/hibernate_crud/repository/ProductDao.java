package com.crud_api.hibernate_crud.repository;


import com.crud_api.hibernate_crud.model.Product;

public interface ProductDao {

     public Product findByName(String name);
}
