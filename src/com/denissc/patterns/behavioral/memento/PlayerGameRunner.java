package com.denissc.patterns.behavioral.memento;

public class PlayerGameRunner {
    public static void main(String[] args) throws InterruptedException {
        Player player = new Player();

        GameSaveStorage gameSaveFile = new GameSaveStorage();
        System.out.println("Player started play at location 'Pit'");
        player.setLocation("Pit");
        System.out.println(player);
        System.out.println("Player saves the game");
        gameSaveFile.setGameSave(player.saveGame());
        System.out.println("Players goes to other location");
        Thread.sleep(1000);
        player.setLocation("Beach");
        System.out.println(player);
        System.out.println("Player killed valuable NPC");
        System.out.println("Player loads game save");

        player.loadGameSave(gameSaveFile.getGameSave());
        System.out.println(player);

    }
}
