package com.denissc.patterns.behavioral.strategy;

/**
 * Created by denissc on 31.07.17.
 */
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
