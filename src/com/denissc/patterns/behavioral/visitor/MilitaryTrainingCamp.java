package com.denissc.patterns.behavioral.visitor;

/**
 * Created by denissc on 31.07.17.
 */
public class MilitaryTrainingCamp {
    TrainingDiscipline[] trainingDisciplines;

    public MilitaryTrainingCamp() {
        this.trainingDisciplines = new TrainingDiscipline[]{
                new Shooting(),
                new ObstacleCourse(),
                new PhysicalTraining()
        };
    }

    public void passTraining(Soldier soldier) {
        for (TrainingDiscipline training :
                trainingDisciplines) {
            training.bePassed(soldier);
        }
    }
}
