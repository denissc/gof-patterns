package com.denissc.patterns.structural.decorator;

public class MarioRunner {
    public static void main(String[] args) {
        PrincessRescuer mario = new SuperMario(new Mario());

        mario.rescuePrincess();
    }
}
