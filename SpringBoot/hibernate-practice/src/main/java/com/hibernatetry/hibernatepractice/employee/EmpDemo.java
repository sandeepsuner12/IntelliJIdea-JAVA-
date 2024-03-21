package com.hibernatetry.hibernatepractice.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpDemo {

    public static void main(String[] args) {

        Configuration confg = new Configuration();
        confg.configure("hibernate.cfg.xml");
        SessionFactory factory = confg.buildSessionFactory();

        Employee emp1 = new Employee("Shohan","Splugenix","123456987","Indore",453771);


        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(emp1);

        tx.commit();
        session.close();
        factory.close();

    }
}
