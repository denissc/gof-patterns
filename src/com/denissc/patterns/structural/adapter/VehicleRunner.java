package com.denissc.patterns.structural.adapter;

/**
 * Created by denissc on 26.07.17.
 */
public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new AdapterCarrigeToVehicle();

        vehicle.start();
        vehicle.move();
    }
}
