package com.solugenix.designpattern.adapter;

public class XYZAndroidCharger implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Charging Phone ...........");
    }
}
