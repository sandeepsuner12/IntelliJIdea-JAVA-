package com.solugenix.designpattern.adapter;

public class Iphone {

    private AppleCharger appleCharger;

    public Iphone(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargePhone(){
        appleCharger.chargeIPhone();
    }
}
