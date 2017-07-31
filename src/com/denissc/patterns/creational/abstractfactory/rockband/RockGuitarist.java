package com.denissc.patterns.creational.abstractfactory.rockband;

import com.denissc.patterns.creational.abstractfactory.Guitarist;

/**
 * Created by denissc on 25.07.17.
 */
public class RockGuitarist implements Guitarist {
    @Override
    public void playGuitar() {
        System.out.println("Rock guitarist plays guitar");
    }
}
