package com.solugenix.designpattern.abstractfactory;

public class DesktopFactory extends ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public DesktopFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    @Override
    public Computer getComputer() {
        return new Desktop(ram,hdd,cpu);
    }
}
