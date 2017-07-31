package com.denissc.patterns.structural.facade;

public class RockGuitarist implements Guitarist {
    @Override
    public void playGuitar() {
        System.out.println("Rock guitarist plays guitar");
    }
}
