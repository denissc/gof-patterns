package com.denissc.patterns.behavioral.state;

/**
 * Created by denissc on 31.07.17.
 */
public class Sleep implements Activity{
    @Override
    public void doActivity() {
        System.out.println("Sleeping..");
    }
}
