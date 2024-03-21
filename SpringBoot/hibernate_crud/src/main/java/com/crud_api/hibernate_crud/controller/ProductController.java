package com.crud_api.hibernate_crud.controller;

import com.crud_api.hibernate_crud.error.ProductErrorResponse;
import com.crud_api.hibernate_crud.error.ProductNotFoundException;
import com.crud_api.hibernate_crud.model.Admin;
import com.crud_api.hibernate_crud.model.Product;
import com.crud_api.hibernate_crud.model.Status;
import com.crud_api.hibernate_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    //AAD product;
    @PostMapping("/product")
    public String addProduct(@RequestBody Product product){
        Product product1 = productService.addProduct(product);
        return "added";
    }
    @PostMapping("/products")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return  productService.addProducts(products);
    }

    @CrossOrigin(origins = "http://localhost:4200" )
    @PostMapping("/adminVerify")
    public Status verifyAdmin(@RequestBody Admin admin){
//        Product product1 = productService.addProduct(admin);
        System.out.println(admin);
//        return new Admin("Shyam","mde123");
        return  new Status(true);
    }

    //Get a product
//    @CrossOrigin(origins = "http://localhost:4200" )
//    @GetMapping(value = "/admindata")
//    public Status getAdmin(){
//        return  new Status(true);
//    }
    @GetMapping(value = "/product/id/{id}", produces = /*"application/xml"*/{MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Product getProduct(@PathVariable int id){
        System.out.println("getProduct from Controller");

        if(id<0){ throw new ProductNotFoundException("Id is not valid " + id);
        }
        return productService.getProduct(id);
    }

    @GetMapping("/product/name/{name}")
    public Product getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @GetMapping("/product/namev2/{name}")
    public Product getProductByNameV2(@PathVariable String name){
        return productService.getProductByNameV2(name);
    }

    @GetMapping("/product/foo")
    public  Product getProductByNameAndPrice(@RequestParam String name , @RequestParam Float price){
        return productService.getProductByNameAandPrice(name,price);
    }
    //Get all product
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }


    //Update a product
    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }




    //Delete a product
    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

//    @ExceptionHandler
//    public ResponseEntity<ProductErrorResponse> exceptionHandler(/*ProductNotFoundException*/MethodArgumentTypeMismatchException ex){
//        ProductErrorResponse error = new ProductErrorResponse();
//        error.setMessage("Only integer Type id is supported ");
//        error.setStatus(HttpStatus.BAD_REQUEST.value());
//        error.setTimestamp(System.currentTimeMillis());
//
//        return  new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
//    }
//    @ExceptionHandler
//    public ResponseEntity<ProductErrorResponse> exceptionHandler(/*ProductNotFoundException*/Exception ex){
//        ProductErrorResponse error = new ProductErrorResponse();
//        error.setMessage(ex.getMessage());
//        error.setStatus(HttpStatus.NOT_FOUND.value());
//        error.setTimestamp(System.currentTimeMillis());
//
//        return  new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
//    }




}
