package com.denissc.patterns.behavioral.visitor;

public class MilitaryCampRunner {
    public static void main(String[] args) {
        MilitaryTrainingCamp militaryTrainingCamp = new MilitaryTrainingCamp();

        Soldier sergeant = new SergeantSoldier();
        Soldier coloner = new ColonerSoldier();

        militaryTrainingCamp.passTraining(sergeant);

        System.out.println("\n=======================\n");

        militaryTrainingCamp.passTraining(coloner);
    }
}
