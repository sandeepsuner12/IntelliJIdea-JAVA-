package com.solugenix.designpattern.observer;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified(String title) {
        System.out.println("Hi "+name+","+title+" - new video is uploaded!");
    }
}
