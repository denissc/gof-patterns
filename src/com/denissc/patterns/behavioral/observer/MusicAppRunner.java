package com.denissc.patterns.behavioral.observer;

public class MusicAppRunner {
    public static void main(String[] args) {
        MusicOneApp musicApp = new MusicOneApp();
        musicApp.addTrack("Music Track 1");
        musicApp.addTrack("Music Track 2");

        Observer firstMeloman = new Meloman("Vasya");
        Observer secondMeloman = new Meloman("Petya");

        musicApp.addObserver(firstMeloman);
        musicApp.addObserver(secondMeloman);

        musicApp.addTrack("Music track 4");
        musicApp.removeObserver(secondMeloman);

        musicApp.addTrack("Music track 6");
    }
}
