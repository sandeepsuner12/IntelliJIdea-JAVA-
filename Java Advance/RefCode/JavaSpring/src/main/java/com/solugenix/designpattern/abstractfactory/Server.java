package com.solugenix.designpattern.abstractfactory;

public class Server implements Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
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
        return "Server{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
