package com.denissc.patterns.creational.abstractfactory.rockband;

import com.denissc.patterns.creational.abstractfactory.Drummer;

/**
 * Created by denissc on 25.07.17.
 */
public class RockDrummer implements Drummer {
    @Override
    public void hitDrum() {
        System.out.println("Rock Drummer hits drum");
    }
}
