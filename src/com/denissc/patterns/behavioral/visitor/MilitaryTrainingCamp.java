package com.denissc.patterns.behavioral.visitor;

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
