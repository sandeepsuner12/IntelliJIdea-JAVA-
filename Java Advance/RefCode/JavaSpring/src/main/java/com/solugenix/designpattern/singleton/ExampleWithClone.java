package com.solugenix.designpattern.singleton;

import java.io.*;

public class ExampleWithClone {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
       // MySingleton singleton = new MySingleton();
       MySingleton4 singleton = MySingleton4.getInstance();
       System.out.println(singleton.hashCode());
        MySingleton4 singleton2 = (MySingleton4) singleton.clone();
        System.out.println(singleton2.hashCode());

        singleton2 = (MySingleton4) singleton.clone();
        System.out.println(singleton2.hashCode());
        singleton2 = (MySingleton4) singleton.clone();
        System.out.println(singleton2.hashCode());
    }
}
