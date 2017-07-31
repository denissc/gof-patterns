package com.denissc.patterns.behavioral.memento;

import java.util.Date;

/**
 * Created by denissc on 31.07.17.
 */
public class GameSave {
    private final String location;
    private final Date date;

    public GameSave(String location) {
        this.location = location;
        this.date = new Date();
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }
}
