package com.denissc.patterns.behavioral.visitor;

/**
 * Created by denissc on 31.07.17.
 */
public class ObstacleCourse implements TrainingDiscipline {
    @Override
    public void bePassed(Soldier soldier) {
        soldier.passTraining(this);
    }
}
