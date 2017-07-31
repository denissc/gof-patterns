package com.denissc.patterns.creational.builder;

public abstract class CarBuilder {
    protected Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildCarType();
    abstract void buildMark();
    abstract void buildPrice();

    Car getCar(){
        return car;
    }
}