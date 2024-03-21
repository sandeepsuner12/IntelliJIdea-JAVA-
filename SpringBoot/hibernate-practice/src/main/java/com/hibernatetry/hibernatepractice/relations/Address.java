package com.hibernatetry.hibernatepractice.relations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

    @Id
    private int id;

    private String city;

    @OneToOne (mappedBy = "address")
    private ClgStudent student;

    public Address(int id, String city) {
        super();
        this.id = id;
        this.city = city;
    }

    public Address() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
