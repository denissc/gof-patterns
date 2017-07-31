package com.denissc.patterns.behavioral.visitor;

public class SergeantSoldier implements Soldier {
    @Override
    public void passTraining(Shooting shooting) {
        System.out.println("Sergeant shoots 3 - 10th, 2 - 8th");
    }

    @Override
    public void passTraining(ObstacleCourse obstacleCourse) {
        System.out.println("Sergeant passes obstacle course in 1 min 50 sec");
    }

    @Override
    public void passTraining(PhysicalTraining physicalTraining) {
        System.out.println("Sergeant not passes all physical training standards");
    }
}
