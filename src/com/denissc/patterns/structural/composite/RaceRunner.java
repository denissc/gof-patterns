package com.denissc.patterns.structural.composite;

/**
 * Created by denissc on 26.07.17.
 */
public class RaceRunner {
    public static void main(String[] args) {
        Race race = new Race();

        BolidCar firstBolidCar = new FOneBolidCar();
        BolidCar secondBolidCar = new FOneBolidCar();
        BolidCar mersedesBolidCar = new MersedesBolidCar();

        race.addBolidCar(firstBolidCar);
        race.addBolidCar(secondBolidCar);
        race.addBolidCar(mersedesBolidCar);

        race.start();
    }
}
