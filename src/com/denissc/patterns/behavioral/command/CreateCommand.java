package com.denissc.patterns.behavioral.command;

/**
 * Created by denissc on 28.07.17.
 */
public class CreateCommand implements Command {
    Task task;

    public CreateCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.create();
    }
}
