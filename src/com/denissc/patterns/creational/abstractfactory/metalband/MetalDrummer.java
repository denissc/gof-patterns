package com.denissc.patterns.creational.abstractfactory.metalband;

import com.denissc.patterns.creational.abstractfactory.Drummer;

public class MetalDrummer implements Drummer {
    @Override
    public void hitDrum() {
        System.out.println("Metal drummer hits drum");
    }
}
