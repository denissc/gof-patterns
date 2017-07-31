package com.denissc.patterns.creational.abstractfactory.metalband;

import com.denissc.patterns.creational.abstractfactory.*;

/**
 * Created by denissc on 25.07.17.
 */
public class MetalBandFactory implements BandFactory {
    @Override
    public Drummer getDrummer() {
        return new MetalDrummer();
    }

    @Override
    public Singer getSinger() {
        return new MetalSinger();
    }

    @Override
    public BassGuitarist getBassGuitarist() {
        return new MetalBassGuitarist();
    }

    @Override
    public Guitarist getGuitarist() {
        return new MetalGuitarist();
    }
}
