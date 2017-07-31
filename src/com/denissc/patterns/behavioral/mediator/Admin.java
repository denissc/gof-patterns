package com.denissc.patterns.behavioral.mediator;

/**
 * Created by denissc on 28.07.17.
 */
public class Admin implements User {
    String name;
    Chat chat;

    public Admin(String name, Chat chat) {
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
