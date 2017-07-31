package com.denissc.patterns.creational.abstractfactory;

import com.denissc.patterns.creational.abstractfactory.rockband.RockBandFactory;

public class RockBandSong {
    public static void main(String[] args) {
        BandFactory bandFactory = new RockBandFactory();
        BassGuitarist bassGuitarist = bandFactory.getBassGuitarist();
        Guitarist guitarist = bandFactory.getGuitarist();
        Singer singer = bandFactory.getSinger();
        Drummer drummer = bandFactory.getDrummer();

        System.out.println("Rock band plays song");

        bassGuitarist.playBassGuitar();
        guitarist.playGuitar();
        singer.sing();
        drummer.hitDrum();
    }
}
