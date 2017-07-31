package com.denissc.patterns.creational.abstractfactory.rockband;

import com.denissc.patterns.creational.abstractfactory.Singer;

public class RockSinger implements Singer {
    @Override
    public void sing() {
        System.out.println("Rock Singer sings song");
    }
}
