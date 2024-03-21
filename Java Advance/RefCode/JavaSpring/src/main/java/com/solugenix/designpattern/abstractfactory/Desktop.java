package com.solugenix.designpattern.abstractfactory;

public class Desktop implements Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public Desktop(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public String getHdd() {
        return hdd;
    }

    @Override
    public String getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
