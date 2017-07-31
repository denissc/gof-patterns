package com.denissc.patterns.behavioral.template;

/**
 * Created by denissc on 31.07.17.
 */
public abstract class SportDisciplineAttempt {
    public void performAttempt(){
        System.out.println("Prepare for attempt");
        makeAttempt();
        System.out.println("Watch attempt result");
    }

    protected abstract void makeAttempt();
}
