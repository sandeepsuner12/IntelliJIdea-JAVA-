package com.solugenix.designpattern.singleton;

public class MySingleton2 {

    private static MySingleton2 mySingleton;

    private MySingleton2() {
    }

    public static MySingleton2 getInstance(){
        //Lazy initialization

        if(mySingleton == null){
            synchronized (MySingleton2.class){
                if(mySingleton == null) {
                    mySingleton = new MySingleton2();
                }
            }

        }

        return mySingleton;
    }
    /*
    1. make constructor private

     */
}
