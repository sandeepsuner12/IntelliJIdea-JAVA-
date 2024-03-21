package com.solugenix.designpattern.adapter;

public class AdapterCharger implements AppleCharger{
    private AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeIPhone() {
        androidCharger.chargeAndroidPhone();
        System.out.println("Your phone is charging with adapter .... ");
    }
}
