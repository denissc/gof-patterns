package com.denissc.patterns.behavioral.mediator;

public class SimpleUser implements User {
    String name;
    Chat chat;

    public SimpleUser(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " received message : " + message);
    }
}
