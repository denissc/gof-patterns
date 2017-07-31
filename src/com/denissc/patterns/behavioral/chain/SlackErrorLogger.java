package com.denissc.patterns.behavioral.chain;

public class SlackErrorLogger extends ErrorLogger {
    public SlackErrorLogger(int errorLevel) {
        super(errorLevel);
    }

    @Override
    protected void logError(String log) {
        System.out.println("Send error log to slack message : " + log);
    }
}
