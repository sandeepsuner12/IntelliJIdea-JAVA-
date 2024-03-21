package com.solugenix.designpattern.abstractfactory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.getComputer();
    }
}
