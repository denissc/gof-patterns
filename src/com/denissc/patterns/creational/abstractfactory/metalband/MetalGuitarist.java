package com.denissc.patterns.creational.abstractfactory.metalband;

import com.denissc.patterns.creational.abstractfactory.Guitarist;

public class MetalGuitarist implements Guitarist {
    @Override
    public void playGuitar() {
        System.out.println("Metal guitarist plays guitar");
    }
}
