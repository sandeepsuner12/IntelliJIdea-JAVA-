package com.hibernatetry.hibernatepractice.relations;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="ClgStudents")
public class ClgStudent {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    //    @Column
    private String name;
    //    @Column

    private int age ;

    @OneToOne /*(mappedBy = "Address")*/(cascade = CascadeType.ALL)
    private  Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> courses ;


    public ClgStudent() {
        super();
    }

    public ClgStudent(int rollNo, String name,  int age, Address address) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
