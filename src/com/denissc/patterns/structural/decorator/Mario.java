package com.denissc.patterns.structural.decorator;

public class Mario implements PrincessRescuer {
    @Override
    public void rescuePrincess() {
        System.out.println("Rescue princess");
    }
}
