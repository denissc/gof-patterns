package com.denissc.patterns.structural.decorator;

/**
 * Created by denissc on 26.07.17.
 */
public class PrincessRescuerDecorator implements PrincessRescuer {
    PrincessRescuer princessRescuer;

    public PrincessRescuerDecorator(PrincessRescuer princessRescuer) {
        this.princessRescuer = princessRescuer;
    }

    @Override
    public void rescuePrincess() {
        princessRescuer.rescuePrincess();
    }
}
