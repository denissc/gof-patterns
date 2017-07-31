package com.denissc.patterns.behavioral.memento;

import java.util.Date;

public class Player {
    private String location;
    private Date date;

    public void setLocation(String location) {
        this.location = location;
        this.date = new Date();
    }

    public GameSave saveGame(){
        return new GameSave(location);
    }

    public void loadGameSave(GameSave gameSave) {
        location = gameSave.getLocation();
        date = gameSave.getDate();
    }

    @Override
    public String toString() {
        return "Player: at Location - '" + location + '\'' +
                ", Date-" + date;
    }
}
