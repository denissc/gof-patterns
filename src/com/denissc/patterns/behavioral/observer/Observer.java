package com.denissc.patterns.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvents(List<String> tracks);
}
