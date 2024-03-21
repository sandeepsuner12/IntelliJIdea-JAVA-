package com.solugenix.designpattern.singleton;

public class Example {
    public static void main(String[] args) {
       // MySingleton singleton = new MySingleton();
       MySingleton singleton = MySingleton.getInstance();
        System.out.println(singleton.hashCode());
        singleton = MySingleton.getInstance();
        System.out.println(singleton.hashCode());
    }
}
