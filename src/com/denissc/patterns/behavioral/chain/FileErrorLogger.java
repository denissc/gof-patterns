package com.denissc.patterns.behavioral.chain;

public class FileErrorLogger extends ErrorLogger {
    public FileErrorLogger(int errorLevel) {
        super(errorLevel);
    }

    @Override
    protected void logError(String log) {
        System.out.println("Writes File.log : " + log);
    }
}
