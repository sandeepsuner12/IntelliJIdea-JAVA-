package com.solugenix.designpattern.singleton;

public class MySingleton {

    private static MySingleton mySingleton;

    //Eager way
    //private static MySingleton mySingleton = new MySingleton();
    private MySingleton() {
    }

    public static MySingleton getInstance(){

            if (mySingleton == null) {
                synchronized (MySingleton.class) {
                //  t1 and t2
                // code before
                    if (mySingleton == null) {
                        mySingleton = new MySingleton();
                    }
                // code after
            }
        }
        return mySingleton;
    }
    /*
    1. make constructor private

     */
}
