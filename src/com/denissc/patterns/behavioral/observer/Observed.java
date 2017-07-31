package com.denissc.patterns.behavioral.observer;

public interface Observed {

    public void notifyObservers();

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);
}
