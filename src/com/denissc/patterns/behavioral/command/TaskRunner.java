package com.denissc.patterns.behavioral.command;

public class TaskRunner {
    public static void main(String[] args) {
        Task task = new Task();

        TaskExecutor taskExecutor = new TaskExecutor(
            new CreateCommand(task),
            new StartCommand(task),
            new FinishCommand(task)
        );

        taskExecutor.createTask();
        taskExecutor.startTask();
        taskExecutor.finishTask();
    }
}
