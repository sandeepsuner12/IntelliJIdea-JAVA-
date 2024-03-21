package com.hibernatetry.hibernatepractice;

import jakarta.persistence.*;

@Entity
@Table(name = "MyStudents")
public class Student {

    public Student(int id, String name, String city, int age, ContactDetails details) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.details = details;
    }

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @Column
    private String name;
//    @Column
    private String city;

    private int age ;
// For O-O and M-M
    private ContactDetails details;

    public Student(String name, String city, int age, ContactDetails details) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.details = details;
    }


    public Student(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ContactDetails getDetails() {
        return details;
    }

    public void setDetails(ContactDetails details) {
        this.details = details;
    }
}
