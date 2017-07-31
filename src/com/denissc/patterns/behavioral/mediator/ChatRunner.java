package com.denissc.patterns.behavioral.mediator;

/**
 * Created by denissc on 28.07.17.
 */
public class ChatRunner {
    public static void main(String[] args) {
        ConsoleChat chat = new ConsoleChat();
        User admin = new Admin("Admin", chat);
        User user = new SimpleUser("User1",chat);
        User user2 = new SimpleUser("User2",chat);

        chat.setAdmin(admin);
        chat.addUser(user);
        chat.addUser(user2);

        user.sendMessage("Hi im u1!");
        admin.sendMessage("I see.");
    }
}
