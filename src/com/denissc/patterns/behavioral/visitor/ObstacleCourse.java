package com.denissc.patterns.behavioral.visitor;

public class ObstacleCourse implements TrainingDiscipline {
    @Override
    public void bePassed(Soldier soldier) {
        soldier.passTraining(this);
    }
}
