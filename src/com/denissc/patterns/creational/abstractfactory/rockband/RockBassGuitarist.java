package com.denissc.patterns.creational.abstractfactory.rockband;

import com.denissc.patterns.creational.abstractfactory.BassGuitarist;

public class RockBassGuitarist implements BassGuitarist {
    @Override
    public void playBassGuitar() {
        System.out.println("Rock bass guitarist plays bass guitar");
    }
}
