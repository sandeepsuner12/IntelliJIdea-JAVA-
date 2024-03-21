package com.solugenix.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ExampleWithReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       // MySingleton singleton = new MySingleton();
       MySingleton3 singleton = MySingleton3.getInstance();
        System.out.println(singleton.hashCode());

        Constructor<MySingleton3> declaredConstructor = MySingleton3.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        MySingleton3 singleton3 = declaredConstructor.newInstance();
        System.out.println(singleton3.hashCode());

    }
}
