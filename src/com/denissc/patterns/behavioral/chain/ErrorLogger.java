package com.denissc.patterns.behavioral.chain;


public abstract class ErrorLogger {
    public int priority;
    public ErrorLogger nextErrorLogger;

    public ErrorLogger(int errorLevel) {
        priority = errorLevel;
    }

    public void setNextErrorLogger(ErrorLogger nextErrorLogger) {
        this.nextErrorLogger = nextErrorLogger;
    }

    public void logErrorManager(String log, int level) {
        if (priority <= level) {
            logError(log);
        }

        if (nextErrorLogger != null) {
            nextErrorLogger.logErrorManager(log, level);
        }
    }

    protected abstract void logError(String log);
}
