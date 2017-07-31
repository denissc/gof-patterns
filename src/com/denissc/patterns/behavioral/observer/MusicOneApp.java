package com.denissc.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MusicOneApp implements Observed {
    private List<String> tracks = new ArrayList<>();
    private List<Observer> melomans = new ArrayList<>();

    public void addTrack(String track) {
        tracks.add(track);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer meloman :
                melomans) {
            meloman.handleEvents(tracks);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        melomans.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        melomans.remove(observer);
    }
}
