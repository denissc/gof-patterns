package com.denissc.patterns.structural.proxy;

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
