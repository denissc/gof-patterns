package com.denissc.patterns.creational.abstractfactory.rockband;

import com.denissc.patterns.creational.abstractfactory.Drummer;

public class RockDrummer implements Drummer {
    @Override
    public void hitDrum() {
        System.out.println("Rock Drummer hits drum");
    }
}
