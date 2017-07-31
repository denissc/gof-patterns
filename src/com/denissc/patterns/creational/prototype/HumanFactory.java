package com.denissc.patterns.creational.prototype;

public class HumanFactory {
    Human human;
    HumanFactory(Human h) {
        human = h;
    }

    Human cloneHuman(){
        return (Human) human.clone();
    }

}
