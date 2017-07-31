package com.denissc.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<BolidCar> cars = new ArrayList<BolidCar>();

    void addBolidCar(BolidCar bolidCar) {
        cars.add(bolidCar);
    }

    void start(){
        System.out.println("Race started");
        for (BolidCar car :
                cars) {
            car.go();
        }
    }
}
