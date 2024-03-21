package com.crud_api.hibernate_crud.service;

import com.crud_api.hibernate_crud.error.ProductNotFoundException;
import com.crud_api.hibernate_crud.model.Product;
import com.crud_api.hibernate_crud.repository.ProductDoaImp;
import com.crud_api.hibernate_crud.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Component
public class ProductService {

    @Autowired
    private ProductRepository repository;

//    public static final Logger logger = LoggerFactory.getLogger(ProductService.class);
    //AAD product;



    @Autowired
    private ProductDoaImp productDoaImp;

    public Product addProduct(Product product){

        Product savedProduct = repository.save(product);


        return savedProduct;
    }
    public List<Product> addProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    //Get a product

    public Product getProduct(int id){
//        logger.info("Add Product Method is Called");
//        logger.info("With Argument value as : " + id);

        System.out.println("getProduct from Service");

        return repository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product is not Available for this id " + id));

//        logger.info("Add Product Method Returned The following : " + fetchedProduct);
        //fetchedProduct;

    }


    //Update a product

    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(new Product());
//        existingProduct.setId(product.getId());
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        System.out.println(existingProduct);
        return  repository.save(existingProduct);
        //existingProduct;
    }


    //Delete a product

    public String deleteProduct(int id){
         repository.deleteById(id);
        return "P deleted";
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }


    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    public Product getProductByNameAandPrice(String name, Float price) {
        return repository.findByNameAndPrice(name,price);
    }

    public Product getProductByNameV2(String name) {
        return productDoaImp.findByName(name);
    }
}
