package com.denissc.patterns.creational.abstractfactory.rockband;

import com.denissc.patterns.creational.abstractfactory.BassGuitarist;

/**
 * Created by denissc on 25.07.17.
 */
public class RockBassGuitarist implements BassGuitarist {
    @Override
    public void playBassGuitar() {
        System.out.println("Rock bass guitarist plays bass guitar");
    }
}
