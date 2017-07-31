package com.denissc.patterns.creational.abstractfactory.rockband;

import com.denissc.patterns.creational.abstractfactory.Guitarist;

public class RockGuitarist implements Guitarist {
    @Override
    public void playGuitar() {
        System.out.println("Rock guitarist plays guitar");
    }
}
