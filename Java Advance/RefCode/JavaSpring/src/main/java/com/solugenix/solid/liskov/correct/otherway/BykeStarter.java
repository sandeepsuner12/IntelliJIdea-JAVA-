package com.solugenix.solid.liskov.correct.otherway;

public class BykeStarter {
    void rideMotoredByke(MotoredByke byke){
        byke.startEngine();
        byke.accelerate();
    }

    void rideManualByke(ManualByke byke){
        byke.peddle();
        byke.accelerate();
    }

    public static void main(String[] args) {
        BykeStarter starter = new BykeStarter();
        starter.rideMotoredByke(new MotorCycle());
        starter.rideManualByke(new Cycle());
    }
}
