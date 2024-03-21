package com.solugenix.solid.liskov.incorrect;

public class MotorCycle implements Byke{
    @Override
    public void startEngine() {
        System.out.println("MotorCycle engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("MotorCycle speed increased");
    }
}
