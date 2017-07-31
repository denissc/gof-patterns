package com.denissc.patterns.structural.decorator;

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
