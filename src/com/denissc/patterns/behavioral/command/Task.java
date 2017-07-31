package com.denissc.patterns.behavioral.command;

public class Task {
    public void create(){
        System.out.println("Task created");
    }

    public void start() {
        System.out.println("Task in progress");
    }

    public void finish() {
        System.out.println("Task is finished");
    }
}
