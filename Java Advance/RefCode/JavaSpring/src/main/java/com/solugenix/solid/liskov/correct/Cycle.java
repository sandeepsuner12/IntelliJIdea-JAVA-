package com.solugenix.solid.liskov.correct;

import com.solugenix.solid.liskov.correct.Byke;

public class Cycle implements Byke {
    @Override
    public void accelerate() {
        System.out.println("Cycle speed increased");
    }
}
