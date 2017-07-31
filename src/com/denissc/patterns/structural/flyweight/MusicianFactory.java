package com.denissc.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MusicianFactory {
    private Map<String, Musician> musicians = new HashMap<>();

    public Musician getMusicianByMusicalInstrument(String musicalInstrument) {
        Musician musician = musicians.get(musicalInstrument);
        if (musician == null) {
            musician = createMusicianByMusicalInstrument(musicalInstrument);
            musicians.put(musicalInstrument, musician);
        }

        return musician;
    }

    private Musician createMusicianByMusicalInstrument(String musicalInstrument) {
        Musician musician = null;
        switch (musicalInstrument) {
            case "guitar":
                System.out.println("Making casting for new guitarist");
                musician = new Guitarist();
                break;
            case "drum":
                System.out.println("Making casting for new drummer");
                musician = new Drummer();
                break;
        }
        return musician;
    }
}
