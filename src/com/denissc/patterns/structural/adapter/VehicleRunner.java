package com.denissc.patterns.structural.adapter;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new AdapterCarriageToVehicle();

        vehicle.start();
        vehicle.move();
    }
}
