package com.denissc.patterns.behavioral.observer;

import java.util.List;

/**
 * Created by denissc on 31.07.17.
 */
public interface Observer {
    void handleEvents(List<String> tracks);
}
