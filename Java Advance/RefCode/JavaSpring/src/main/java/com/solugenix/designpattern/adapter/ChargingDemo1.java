package com.solugenix.designpattern.adapter;

public class ChargingDemo1 {
    public static void main(String[] args) {
        AppleCharger appleCharger = new ABCAppleCharger();
        AndroidCharger androidCharger = new XYZAndroidCharger();
        Iphone iphone = new Iphone(appleCharger);
        iphone.chargePhone();
    }
}
