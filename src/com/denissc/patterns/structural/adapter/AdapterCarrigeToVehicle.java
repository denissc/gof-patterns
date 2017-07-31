package com.denissc.patterns.structural.adapter;

/**
 * Created by denissc on 26.07.17.
 */
public class AdapterCarrigeToVehicle extends Carriage implements Vehicle {
    @Override
    public void start() {
        putTheHourses();
    }

    @Override
    public void move() {
        ride();
    }
}
