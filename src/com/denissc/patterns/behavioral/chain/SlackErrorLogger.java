package com.denissc.patterns.behavioral.chain;

/**
 * Created by denissc on 28.07.17.
 */
public class SlackErrorLogger extends ErrorLogger {
    public SlackErrorLogger(int errorLevel) {
        super(errorLevel);
    }

    @Override
    protected void logError(String log) {
        System.out.println("Send error log to slack message : " + log);
    }
}
