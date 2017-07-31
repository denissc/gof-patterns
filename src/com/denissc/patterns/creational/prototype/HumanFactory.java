package com.denissc.patterns.creational.prototype;

/**
 * Created by denissc on 26.07.17.
 */
public class HumanFactory {
    Human human;
    HumanFactory(Human h) {
        human = h;
    }

    Human cloneHuman(){
        return (Human) human.clone();
    }

}
