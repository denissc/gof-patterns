package com.denissc.patterns.behavioral.chain;

/**
 * Created by denissc on 28.07.17.
 */
public class FileErrorLogger extends ErrorLogger {
    public FileErrorLogger(int errorLevel) {
        super(errorLevel);
    }

    @Override
    protected void logError(String log) {
        System.out.println("Writes File.log : " + log);
    }
}
