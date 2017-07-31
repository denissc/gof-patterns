package com.denissc.patterns.behavioral.strategy;

public class FrogActivityRunner {
    public static void main(String[] args) {
        Frog frog = new Frog();

        frog.setActivity(new Sleep());
        frog.doActivity();

        frog.setActivity(new Eating());
        frog.doActivity();

        frog.setActivity(new Sleep());
        frog.doActivity();
    }
}
