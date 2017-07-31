package com.denissc.patterns.structural.facade;

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
