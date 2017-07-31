package com.denissc.patterns.creational.builder;

public class LadaCarBuilder extends CarBuilder{

    @Override
    void buildCarType() {
        car.setType(CarType.LIGHTWEIGHT);
    }

    @Override
    void buildMark() {
        car.setMark("Lada");
    }

    @Override
    void buildPrice() {
        car.setPrice(2000);
    }
}
