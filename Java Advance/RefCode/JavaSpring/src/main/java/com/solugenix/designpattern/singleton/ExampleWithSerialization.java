package com.solugenix.designpattern.singleton;

import java.io.*;

public class ExampleWithSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // MySingleton singleton = new MySingleton();
       MySingleton3 singleton = MySingleton3.getInstance();
       System.out.println(singleton.hashCode());
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("obj1.ob"));
        os.writeObject(singleton);
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("obj1.ob"));
        MySingleton3 singleton3 = (MySingleton3) is.readObject();
        System.out.println(singleton3.hashCode());
    }
}
