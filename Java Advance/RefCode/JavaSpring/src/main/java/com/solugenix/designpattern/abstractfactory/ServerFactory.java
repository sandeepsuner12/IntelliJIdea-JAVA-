package com.solugenix.designpattern.abstractfactory;

public class ServerFactory extends ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    @Override
    public Computer getComputer() {
        return new Server(ram,hdd,cpu);
    }
}
