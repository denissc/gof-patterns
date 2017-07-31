package com.denissc.patterns.behavioral.visitor;

public class PhysicalTraining implements TrainingDiscipline {

    @Override
    public void bePassed(Soldier soldier) {
        soldier.passTraining(this);
    }
}
