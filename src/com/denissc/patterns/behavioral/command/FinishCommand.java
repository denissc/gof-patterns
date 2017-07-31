package com.denissc.patterns.behavioral.command;

public class FinishCommand implements Command{
    Task task;

    public FinishCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.finish();
    }
}
