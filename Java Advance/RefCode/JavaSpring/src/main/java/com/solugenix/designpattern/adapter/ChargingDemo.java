package com.solugenix.designpattern.adapter;

public class ChargingDemo {
    public static void main(String[] args) {
        AppleCharger appleCharger =  new AdapterCharger(new XYZAndroidCharger());
        Iphone iphone = new Iphone(appleCharger);
        iphone.chargePhone();

        ///MY tests on it
        AdapterCharger adapterCharger =  new AdapterCharger(new XYZAndroidCharger());
        Iphone nIphone = new Iphone(adapterCharger);
        nIphone.chargePhone();
    }
}
