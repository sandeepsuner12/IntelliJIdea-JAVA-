package com.solugenix.designpattern.adapter;

public class ABCAppleCharger implements AppleCharger{
    @Override
    public void chargeIPhone() {
        System.out.println("Charging Iphone........");
    }
}
