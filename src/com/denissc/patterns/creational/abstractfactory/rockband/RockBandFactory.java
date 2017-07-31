package com.denissc.patterns.creational.abstractfactory.rockband;

import com.denissc.patterns.creational.abstractfactory.*;

public class RockBandFactory implements BandFactory {
    @Override
    public Drummer getDrummer() {
        return new RockDrummer();
    }

    @Override
    public Singer getSinger() {
        return new RockSinger();
    }

    @Override
    public BassGuitarist getBassGuitarist() {
        return new RockBassGuitarist();
    }

    @Override
    public Guitarist getGuitarist() {
        return new RockGuitarist();
    }
}
