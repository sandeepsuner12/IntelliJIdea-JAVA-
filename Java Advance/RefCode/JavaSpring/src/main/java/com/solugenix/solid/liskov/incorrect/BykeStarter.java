package com.solugenix.solid.liskov.incorrect;

public class BykeStarter {
    void rideByke(Byke byke){
        byke.startEngine();
        byke.accelerate();
    }

    public static void main(String[] args) {
        BykeStarter starter = new BykeStarter();
        starter.rideByke(new MotorCycle());
        starter.rideByke(new Cycle());
    }
}
