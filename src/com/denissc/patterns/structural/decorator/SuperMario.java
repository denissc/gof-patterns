package com.denissc.patterns.structural.decorator;

/**
 * Created by denissc on 26.07.17.
 */
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
