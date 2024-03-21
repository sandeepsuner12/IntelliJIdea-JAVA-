package com.hibernatetry.hibernatepractice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateCycle {
    public static void main(String[] args) {

        SpringApplication.run(HibernateCycle.class, args);

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        SessionFactory factroy = config.buildSessionFactory();

        //Transit State Begins
        Student st1 = new Student(321,"Transtit","Tstate",5,new ContactDetails());

        Session session = factroy.openSession();
        Transaction tx = session.beginTransaction();

        //Transit state end Presiste State begins
        session.save(st1);
        //tx.commit(); for 555
        //Student st1 = new Student(555,"Persist","Pstate",5,new ContactDetails());
        st1.setName("Persits");

        //Persits State end and detached Sate begins
        session.detach(st1);
        st1.setName("Detached");

        //Persits State begin and detached Sate end;
        // st1.setId(991);
//        st1.setName("Persits2");
        session.update(st1);

        tx.commit();

        session.close();
        factroy.close();
    }
}
