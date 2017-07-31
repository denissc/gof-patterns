package com.denissc.patterns.structural.facade;

public class RockSinger implements Singer {
    @Override
    public void sing() {
        System.out.println("Rock Singer sings song");
    }
}
