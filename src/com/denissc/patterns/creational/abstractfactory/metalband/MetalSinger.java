package com.denissc.patterns.creational.abstractfactory.metalband;

import com.denissc.patterns.creational.abstractfactory.Singer;

public class MetalSinger implements Singer {
    @Override
    public void sing() {
        System.out.println("Metal singer screams");
    }
}
