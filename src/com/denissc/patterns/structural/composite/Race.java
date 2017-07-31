package com.denissc.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<BolideCar> cars = new ArrayList<BolideCar>();

    void addBolidCar(BolideCar bolideCar) {
        cars.add(bolideCar);
    }

    void start(){
        System.out.println("Race started");
        for (BolideCar car :
                cars) {
            car.go();
        }
    }
}
