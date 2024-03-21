package com.crud_api.hibernate_crud.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> exceptionHandler(/*ProductNotFoundException*/MethodArgumentTypeMismatchException ex){
        ProductErrorResponse error = new ProductErrorResponse();
        error.setMessage("Only integer Type id is supported ");
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setTimestamp(System.currentTimeMillis());

        return  new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> exceptionHandler(/*ProductNotFoundException*/Exception ex){
        ProductErrorResponse error = new ProductErrorResponse();
        error.setMessage(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setTimestamp(System.currentTimeMillis());

        return  new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
}
