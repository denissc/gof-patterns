package com.denissc.patterns.behavioral.command;

/**
 * Created by denissc on 28.07.17.
 */
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
