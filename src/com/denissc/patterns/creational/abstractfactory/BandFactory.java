package com.denissc.patterns.creational.abstractfactory;

/**
 * Created by denissc on 25.07.17.
 */
public interface BandFactory {
    Drummer getDrummer();
    Singer getSinger();
    BassGuitarist getBassGuitarist();
    Guitarist getGuitarist();
}