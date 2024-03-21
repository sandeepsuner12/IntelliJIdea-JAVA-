package com.hibernatetry.hibernatepractice.relations;

import com.hibernatetry.hibernatepractice.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HibernateOneToOne_ManyToMany {

    public static void main(String[] args) {

        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        SessionFactory f = c.buildSessionFactory();


        List<ClgStudent> clgStudentList1 = new ArrayList<>();
        List<Course> courseList1 = new ArrayList<>();;

        Address ad1 = new Address(1 , "Indore");
        Address ad2 = new Address(2,"Ujjain");

        Course c1 = new Course(1,"Java");
        Course c2 = new Course(2 ,"Python");
        Course c3 = new Course(3,"DBMS");

        ClgStudent st1 = new ClgStudent(1,"Ram" ,18 , ad1 );
        ClgStudent st2 = new ClgStudent(2,"Sam" ,18 , ad2 );

        clgStudentList1.add(st1);
        clgStudentList1.add(st2);

        courseList1.add(c1);
        courseList1.add(c2);
        courseList1.add(c3);

        st1.setCourses(courseList1);
        st2.setCourses(courseList1);

        c1.setStudents(clgStudentList1);
        c2.setStudents(clgStudentList1);
        c3.setStudents(clgStudentList1);

        Session s = f.openSession();
        Transaction t = s.beginTransaction();

        s.persist(st1);
        s.persist(st2);

//        s.persist(ad1);
//        s.persist(ad2);
//
//        s.save(c1);
//        s.save(c2);
//        s.save(c3);

        t.commit();

        s.close();
        f.close();




    }

}
