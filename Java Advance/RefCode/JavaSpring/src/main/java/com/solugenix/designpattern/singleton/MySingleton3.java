package com.solugenix.designpattern.singleton;

import java.io.Serializable;

public class MySingleton3 implements Serializable{

    private static MySingleton3 mySingleton;

    private MySingleton3() {
        if (mySingleton != null) {
            throw new RuntimeException("trying to break singleton");
        }
    }

    public static MySingleton3 getInstance() {
        //Lazy initialization

        if (mySingleton == null) {
            synchronized (MySingleton3.class) {
                if (mySingleton == null) {
                    mySingleton = new MySingleton3();
                }
            }

        }

        return mySingleton;
    }

    public Object readResolve(){
        return mySingleton;
    }

}
