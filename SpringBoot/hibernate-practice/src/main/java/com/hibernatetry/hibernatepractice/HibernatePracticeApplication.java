package com.hibernatetry.hibernatepractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernatePracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(HibernatePracticeApplication.class, args);

//		SessionFactory factory = new Configuration().buildSessionFactory();
		Configuration confg = new Configuration();
		confg.configure("hibernate.cfg.xml");
		SessionFactory factory = confg.buildSessionFactory();


		Student stu1 = new Student(101,"Ram" ,"Indore",18, new ContactDetails("Riva","Sita", "7894561230"));
//		Student stu1 = new Student("Ram" ,"Indore",18);

		ContactDetails details2 = new ContactDetails("Satna","Mohan", "8521479630");
		Student stu2 = new Student(102,"Sham" ,"Ujjain",20,details2 /* new ContactDetails("Satna","Mohan", "8521479630")*/);
//		System.out.println(stu1);

//		Student stu2 = new Student("Sham" ,"Ujjain",20);
//		System.out.println(stu2);

		Session session = factory.openSession();
		//session = factory.g
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(stu1);
		session.saveOrUpdate(stu2);
		tx.commit();
		session.close();
		factory.close();



		//System.out.println(factory);
	}

}
