package com.denissc.patterns.creational.builder;

public class FormulaOneCarBuilder extends CarBuilder{
    @Override
    void buildCarType() {
        car.setType(CarType.BOLID);
    }

    @Override
    void buildMark() {
        car.setMark("F1");
    }

    @Override
    void buildPrice() {
        car.setPrice(50000);
    }
}
