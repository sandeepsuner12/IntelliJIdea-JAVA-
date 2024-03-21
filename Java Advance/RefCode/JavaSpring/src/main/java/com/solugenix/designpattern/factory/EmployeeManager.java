package com.solugenix.designpattern.factory;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("architect");
        System.out.println(employee.getSalary());
         employee = EmployeeFactory.getEmployee("developer");
        System.out.println(employee.getSalary());
        //employee = EmployeeFactory.getEmployee("xyz");
        //System.out.println(employee.getSalary());
    }
}
