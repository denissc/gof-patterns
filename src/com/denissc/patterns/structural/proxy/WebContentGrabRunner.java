package com.denissc.patterns.structural.proxy;

public class WebContentGrabRunner {
    public static void main(String[] args) {
        WebContentGrabber webContentGrabber = new ProxyWebContentGrabber("http://google.com");

        System.out.println(webContentGrabber.getContent());
    }
}
