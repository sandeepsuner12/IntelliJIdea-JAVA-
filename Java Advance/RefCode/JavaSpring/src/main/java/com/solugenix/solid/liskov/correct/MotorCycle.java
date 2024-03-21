package com.solugenix.solid.liskov.correct;

public class MotorCycle implements Byke {
    @Override
    public void accelerate() {
        System.out.println("MotorCycle speed increased");
    }

    public void startEngine() {
        System.out.println("MotorCycle engine started");
    }
}
