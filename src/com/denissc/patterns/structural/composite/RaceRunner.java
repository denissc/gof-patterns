package com.denissc.patterns.structural.composite;

public class RaceRunner {
    public static void main(String[] args) {
        Race race = new Race();

        BolideCar firstBolideCar = new FOneBolideCar();
        BolideCar secondBolideCar = new FOneBolideCar();
        BolideCar mersedesBolideCar = new MersedesBolideCar();

        race.addBolidCar(firstBolideCar);
        race.addBolidCar(secondBolideCar);
        race.addBolidCar(mersedesBolideCar);

        race.start();
    }
}
