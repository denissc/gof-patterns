package com.denissc.patterns.behavioral.chain;

/**
 * Created by denissc on 28.07.17.
 */
public class ConsoleErrorLogger extends ErrorLogger {

    public ConsoleErrorLogger(int errorLevel) {
        super(errorLevel);
    }

    @Override
    protected void logError(String log) {
        System.out.println("Console out: " + log);
    }
}
