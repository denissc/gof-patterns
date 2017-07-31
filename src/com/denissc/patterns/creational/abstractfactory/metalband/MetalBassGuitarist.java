package com.denissc.patterns.creational.abstractfactory.metalband;

import com.denissc.patterns.creational.abstractfactory.BassGuitarist;

public class MetalBassGuitarist implements BassGuitarist {
    @Override
    public void playBassGuitar() {
        System.out.println("Metal Bass guitarist plays bass guitar");
    }
}
