package com.denissc.patterns.structural.adapter;

public class AdapterCarriageToVehicle extends Carriage implements Vehicle {
    @Override
    public void start() {
        putTheHorses();
    }

    @Override
    public void move() {
        ride();
    }
}
