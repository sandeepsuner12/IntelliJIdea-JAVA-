package com.solugenix.solid.liskov.correct.otherway;

public class Cycle implements ManualByke {
    @Override
    public void accelerate() {
        System.out.println("Cycle speed increased");
    }

    @Override
    public void peddle() {
        System.out.println("Peddling Cycle");
    }
}
