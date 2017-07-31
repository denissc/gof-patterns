package com.denissc.patterns.behavioral.strategy;

public class Sleep implements Activity {
    @Override
    public void doActivity() {
        System.out.println("Sleeping..");
    }
}
