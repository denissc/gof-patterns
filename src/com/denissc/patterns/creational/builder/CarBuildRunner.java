package com.denissc.patterns.creational.builder;

public class CarBuildRunner {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();

        engineer.setBuilder(new FormulaOneCarBuilder());

        Car car = engineer.buildCar();

        System.out.println(car);
    }
}
