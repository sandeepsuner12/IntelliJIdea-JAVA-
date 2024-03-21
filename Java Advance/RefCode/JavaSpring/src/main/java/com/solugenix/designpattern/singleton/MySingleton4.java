package com.solugenix.designpattern.singleton;

public class MySingleton4 implements Cloneable{

    private static MySingleton4 mySingleton;

    /*private MySingleton4() {
        if (mySingleton != null) {
            throw new RuntimeException("trying to break singleton");
        }
    }*/

    public static MySingleton4 getInstance() {
        //Lazy initialization

        if (mySingleton == null) {
            synchronized (MySingleton4.class) {
                if (mySingleton == null) {
                    mySingleton = new MySingleton4();
                }
            }

        }

        return mySingleton;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return mySingleton;
    }

}
