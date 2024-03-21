package com.solugenix.designpattern.factory;

public class Developer implements Employee{
    @Override
    public int getSalary() {
        System.out.println("getting developer salary");
        return 50000;
    }
}
