package com.crud_api.hibernate_crud.repository;

import com.crud_api.hibernate_crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

    @Query("Select p from Product p where p.name=?1 and p.price=?2")
    Product findByNameAndPrice(String name, Float price);
}

