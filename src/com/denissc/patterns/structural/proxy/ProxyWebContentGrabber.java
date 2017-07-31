package com.denissc.patterns.structural.proxy;

/**
 * Created by denissc on 27.07.17.
 */
public class ProxyWebContentGrabber implements WebContentGrabber {
    private WebContentGrabber webContentGrabber;
    private String url;

    public ProxyWebContentGrabber(String url) {
        this.url = url;
    }

    @Override
    public String getContent() {
        if (webContentGrabber == null) {
            webContentGrabber = new DirectWebContentGrabber(url);
        }

        return webContentGrabber.getContent();
    }
}
