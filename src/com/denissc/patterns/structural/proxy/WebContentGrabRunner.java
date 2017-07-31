package com.denissc.patterns.structural.proxy;

/**
 * Created by denissc on 27.07.17.
 */
public class WebContentGrabRunner {
    public static void main(String[] args) {
        WebContentGrabber webContentGrabber = new ProxyWebContentGrabber("http://google.com");

        System.out.println(webContentGrabber.getContent());
    }
}
