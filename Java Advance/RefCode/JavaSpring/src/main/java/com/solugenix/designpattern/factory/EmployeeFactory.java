package com.solugenix.designpattern.factory;

public class EmployeeFactory {

    public static Employee getEmployee(String type){
        if("developer".equals(type)){
            return new Developer();
        }else if("architect".equals(type)){
            return new Architect();
        }else{
            return null;
        }

    }
}
