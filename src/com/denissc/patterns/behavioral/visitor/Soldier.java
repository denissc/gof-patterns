package com.denissc.patterns.behavioral.visitor;

public interface Soldier {
    public void passTraining(Shooting shooting);

    public void passTraining(ObstacleCourse obstacleCourse);

    public void passTraining(PhysicalTraining physicalTraining);
}
