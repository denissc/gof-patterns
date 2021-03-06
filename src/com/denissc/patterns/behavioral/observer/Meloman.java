package com.denissc.patterns.behavioral.observer;

import java.util.List;

public class Meloman implements Observer {
    private String name;

    public Meloman(String name) {
        this.name = name;
    }

    @Override
    public void handleEvents(List<String> tracks) {
        System.out.println("Meloman " + name + " Listens new tracks" + tracks);
    }
}
