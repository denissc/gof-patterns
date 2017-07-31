package com.denissc.patterns.behavioral.memento;

public class GameSaveStorage {
    private GameSave gameSave;

    public GameSave getGameSave() {
        return gameSave;
    }

    public void setGameSave(GameSave gameSave) {
        this.gameSave = gameSave;
    }
}
