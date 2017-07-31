package com.denissc.patterns.structural.decorator;

public class SuperMario extends PrincessRescuerDecorator {

    public SuperMario(PrincessRescuer princessRescuer) {
        super(princessRescuer);
    }

    void beatEnemies(){
        System.out.println("Beats enemies");
    }

    @Override
    public void rescuePrincess() {
        beatEnemies();
        super.rescuePrincess();
    }
}
