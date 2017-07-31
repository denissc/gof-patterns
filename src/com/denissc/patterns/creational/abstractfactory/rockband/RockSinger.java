package com.denissc.patterns.creational.abstractfactory.rockband;

import com.denissc.patterns.creational.abstractfactory.Singer;

/**
 * Created by denissc on 25.07.17.
 */
public class RockSinger implements Singer {
    @Override
    public void sing() {
        System.out.println("Rock Singer sings song");
    }
}
