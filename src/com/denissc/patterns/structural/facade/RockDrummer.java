package com.denissc.patterns.structural.facade;

public class RockDrummer implements Drummer {
    @Override
    public void hitDrum() {
        System.out.println("Rock Drummer hits drum");
    }
}
