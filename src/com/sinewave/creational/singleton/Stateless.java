package com.sinewave.creational.singleton;

import javax.swing.plaf.nimbus.State;

public class Stateless {

    private static final Stateless stateless = new Stateless();

    private Stateless() {
        System.out.println("I'm alive now");
    }

    public static Stateless getInstance() {
        return stateless;
    }
}
