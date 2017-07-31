package com.denissc.patterns.structural.facade;

import com.denissc.patterns.creational.abstractfactory.Drummer;
import com.denissc.patterns.creational.abstractfactory.Guitarist;
import com.denissc.patterns.creational.abstractfactory.Singer;
import com.denissc.patterns.creational.abstractfactory.rockband.RockDrummer;
import com.denissc.patterns.creational.abstractfactory.rockband.RockGuitarist;
import com.denissc.patterns.creational.abstractfactory.rockband.RockSinger;

public class MusicBand {
    Drummer drummer = new RockDrummer();
    Singer singer = new RockSinger();
    Guitarist guitarist = new RockGuitarist();

    void playSong(){
        System.out.println("Start playing song");
        drummer.hitDrum();
        drummer.hitDrum();
        drummer.hitDrum();
        singer.sing();
        guitarist.playGuitar();

    }
}
