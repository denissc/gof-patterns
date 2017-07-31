package com.denissc.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denissc on 27.07.17.
 */
public class RepetitionRunner {
    public static void main(String[] args) {
        MusicianFactory musicianFactory = new MusicianFactory();

        List<Musician> musicians = new ArrayList<>();

        musicians.add(musicianFactory.getMusicianByMusicalInstrument("guitar"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("guitar"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("guitar"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("guitar"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("guitar"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("guitar"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("guitar"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("drum"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("drum"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("drum"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("drum"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("drum"));
        musicians.add(musicianFactory.getMusicianByMusicalInstrument("drum"));

        for (Musician musician :
                musicians) {
            musician.playMusic();
        }

    }
}
