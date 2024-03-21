package com.solugenix.solid.liskov.correct;

public class BykeStarter {
    void rideByke(Byke byke){
        byke.accelerate();
    }

    public static void main(String[] args) {
        BykeStarter starter = new BykeStarter();
        MotorCycle motorCycle = new MotorCycle();
        motorCycle.startEngine();
        starter.rideByke(motorCycle);
        starter.rideByke(new Cycle());
    }
}
