package com.denissc.patterns.creational.abstractfactory;

public interface BandFactory {
    Drummer getDrummer();
    Singer getSinger();
    BassGuitarist getBassGuitarist();
    Guitarist getGuitarist();
}
