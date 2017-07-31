package com.denissc.patterns.creational.abstractfactory;

import com.denissc.patterns.creational.abstractfactory.metalband.MetalBandFactory;

public class MetalBandSong {
    public static void main(String[] args) {
        BandFactory bandFactory = new MetalBandFactory();
        Drummer drummer = bandFactory.getDrummer();
        Guitarist guitarist = bandFactory.getGuitarist();
        BassGuitarist bassGuitarist = bandFactory.getBassGuitarist();
        Singer singer = bandFactory.getSinger();

        System.out.println("Metal band sings rock song");

        drummer.hitDrum();
        guitarist.playGuitar();
        bassGuitarist.playBassGuitar();
        singer.sing();
    }
}
