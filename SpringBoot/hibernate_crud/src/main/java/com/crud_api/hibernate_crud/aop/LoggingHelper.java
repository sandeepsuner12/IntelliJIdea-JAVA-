package com.crud_api.hibernate_crud.aop;


import com.crud_api.hibernate_crud.error.ProductNotFoundException;
import com.crud_api.hibernate_crud.model.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.Arrays;
import java.util.Objects;

@Component
@Aspect
public class LoggingHelper {


    public  static  final Logger logger = LoggerFactory.getLogger("LoggingHelper");

    @Pointcut("execution( * com.crud_api.hibernate_crud.service.ProductService.*(..))")
    public void cutPoint(){

    }
    /*
    @Before("cutPoint()")
    public void logger(JoinPoint joinPoint){
        //System.out.println("From Aop Logger");
        //logger.info("Class : " + joinPoint.getTarget());
////       logger.info("Class : " + joinPoint.getTarget().getClass().getCanonicalName());
//        logger.info("Class : " + joinPoint.getTarget().getClass().getSimpleName());
//        logger.info("Method : " + joinPoint.getSignature().getName());
//        logger.info("Args : " + Arrays.toString(joinPoint.getArgs()));

        logger.info("Before Advice --> Method :: "+ joinPoint.getSignature().getName()+
                " |Class :: "+ joinPoint.getTarget().getClass().getSimpleName()+
                " |Args :: " + Arrays.toString(joinPoint.getArgs()));
    }

    @After("cutPoint()")
    public void afterLogger(JoinPoint joinPoint){
        logger.info("After Advice |--> Method :: " +joinPoint.getSignature().getName()+
                " |Class :: " +joinPoint.getTarget().getClass().getSimpleName()+
                " |Args :: " + Arrays.toString(joinPoint.getArgs()));
    }

*/
    @AfterReturning(value = "cutPoint()", returning = "returnedObject")
    public void afterReturning(JoinPoint joinPoint , Object returnedObject) {

        logger.info("After Returning Advice --> Method :: " + joinPoint.getSignature() +
                " |Class :: " + joinPoint.getTarget().getClass().getSimpleName() +
                " |Args :: " + Arrays.toString(joinPoint.getArgs()) +
                " |Returned :: " + returnedObject);

//        return (Product) returnedObject;
    }

/*
    @Around("cutPoint()")
    public  Object  aroundLogger(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Around Advice |--> Method :: " +proceedingJoinPoint.getSignature().getName()+
                " |Class :: " +proceedingJoinPoint.getTarget().getClass().getSimpleName()+
                " |Args :: " + Arrays.toString(proceedingJoinPoint.getArgs()));

//        if(Integer.parseInt(proceedingJoinPoint.getArgs()[0].toString()) >12){
//            throw  new ProductNotFoundException("Product is not present");
//        }

        Object responce = proceedingJoinPoint.proceed();
        logger.info("Around Advice 2 |--> Method :: " +responce);

        return responce;
    }*/

    @AfterThrowing(value = "cutPoint()" , throwing = "ex")
    public Object afterThrowing(JoinPoint joinPoint, Throwable ex){
        logger.info("AfterThrowing Advice |--> Method :: " +joinPoint.getSignature().getName()+
                " |Class :: " +joinPoint.getTarget().getClass().getSimpleName()+
                " |Args :: " + Arrays.toString(joinPoint.getArgs())+
                " |Message :: " + ex.getMessage());
        return ex;
    }


}
