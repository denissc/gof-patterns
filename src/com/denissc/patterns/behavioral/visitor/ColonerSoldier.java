package com.denissc.patterns.behavioral.visitor;

public class ColonerSoldier implements Soldier {

    @Override
    public void passTraining(Shooting shooting) {
        System.out.println("Col. shoots all 10th...");
    }

    @Override
    public void passTraining(ObstacleCourse obstacleCourse) {
        System.out.println("Col. passes obstacle course in 1 min 30 sec");
    }

    @Override
    public void passTraining(PhysicalTraining physicalTraining) {
        System.out.println("Col. passes physical standards");
    }
}
