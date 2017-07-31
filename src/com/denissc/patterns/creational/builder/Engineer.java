package com.denissc.patterns.creational.builder;

public class Engineer {
    CarBuilder builder;

    void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar(){
        builder.createCar();
        builder.buildCarType();
        builder.buildMark();
        builder.buildPrice();

        return builder.getCar();
    }
}
