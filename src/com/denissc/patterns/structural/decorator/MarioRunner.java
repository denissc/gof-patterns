package com.denissc.patterns.structural.decorator;

/**
 * Created by denissc on 26.07.17.
 */
public class MarioRunner {
    public static void main(String[] args) {
        PrincessRescuer mario = new SuperMario(new Mario());

        mario.rescuePrincess();
    }
}
