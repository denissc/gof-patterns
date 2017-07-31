package com.denissc.patterns.structural.proxy;

/**
 * Created by denissc on 27.07.17.
 */
public class DirectWebContentGrabber implements WebContentGrabber {
    private String url;
    public DirectWebContentGrabber(String url) {
        this.url = url;
        loadContent();
    }

    private void loadContent() {
        System.out.println("Loading " + url + " content");
    }

    public String getContent() {
        return "Content of " + url + "\n<html>....</html>";
    }


}
