package com.solugenix.solid.liskov.incorrect;

public class Cycle implements Byke{
    @Override
    public void startEngine() {
        throw new AssertionError("There is no cycle engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Cycle speed increased");
    }
}
