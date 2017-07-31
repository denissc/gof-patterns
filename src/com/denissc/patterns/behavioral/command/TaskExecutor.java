package com.denissc.patterns.behavioral.command;

public class TaskExecutor {
    Command create;
    Command start;
    Command finish;

    public TaskExecutor(Command create, Command start, Command finish) {
        this.create = create;
        this.start = start;
        this.finish = finish;
    }

    public void createTask(){
        create.execute();
    }

    public void startTask() {
        start.execute();
    }

    public void finishTask(){
        finish.execute();
    }
}
