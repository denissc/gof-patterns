package com.denissc.patterns.behavioral.chain;

public class ErrorLogRunner {
    public static void main(String[] args) {
        ErrorLogger consoleErrorLogger = new ConsoleErrorLogger(ErrorLevel.NOTICE);
        ErrorLogger fileErrorLogger = new FileErrorLogger(ErrorLevel.WARNING);
        ErrorLogger slackErrorLogger = new SlackErrorLogger(ErrorLevel.FATAL);

        consoleErrorLogger.setNextErrorLogger(fileErrorLogger);
        fileErrorLogger.setNextErrorLogger(slackErrorLogger);

        consoleErrorLogger.logErrorManager("This argument is not best fits function call.", ErrorLevel.NOTICE);
        consoleErrorLogger.logErrorManager("This function don`t seems to work properly.", ErrorLevel.WARNING);
        consoleErrorLogger.logErrorManager("NullPointerExeption in function_name line 32.", ErrorLevel.FATAL);

    }
}
