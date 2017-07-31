package com.denissc.patterns.behavioral.observer;

/**
 * Created by denissc on 31.07.17.
 */
public interface Observed {

    public void notifyObservers();

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);
}
