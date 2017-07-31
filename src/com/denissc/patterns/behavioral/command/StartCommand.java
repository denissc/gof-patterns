package com.denissc.patterns.behavioral.command;

public class StartCommand implements Command {
    Task task;

    public StartCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.start();
    }
}
