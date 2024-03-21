package com.solugenix.designpattern.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        Computer desktop =  ComputerFactory.getComputer(new DesktopFactory("4GB", "512GB", "i3"));
        System.out.println(desktop);
        Computer server =  ComputerFactory.getComputer(new ServerFactory("64GB", "2TB", "i7"));
        System.out.println(server   );
    }
}
