package com.solugenix.designpattern.factory;

public class Architect implements Employee{
    @Override
    public int getSalary() {
        System.out.println("getting Architect salary");
        return 100000;
    }
}
