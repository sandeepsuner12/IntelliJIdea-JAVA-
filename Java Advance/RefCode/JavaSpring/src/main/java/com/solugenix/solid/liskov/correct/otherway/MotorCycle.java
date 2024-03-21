package com.solugenix.solid.liskov.correct.otherway;

public class MotorCycle implements MotoredByke {
    @Override
    public void accelerate() {
        System.out.println("MotorCycle speed increased");
    }
    @Override
    public void startEngine() {
        System.out.println("MotorCycle engine started");
    }
}
