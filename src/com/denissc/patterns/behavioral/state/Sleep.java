package com.denissc.patterns.behavioral.state;

public class Sleep implements Activity{
    @Override
    public void doActivity() {
        System.out.println("Sleeping..");
    }
}
