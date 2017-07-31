package com.denissc.patterns.behavioral.command;

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
