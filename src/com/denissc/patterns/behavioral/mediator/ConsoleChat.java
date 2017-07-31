package com.denissc.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denissc on 28.07.17.
 */
public class ConsoleChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u : users) {
            if (u!=user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
