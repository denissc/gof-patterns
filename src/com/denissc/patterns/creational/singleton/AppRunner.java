package com.denissc.patterns.creational.singleton;

/**
 * Created by denissc on 25.07.17.
 */
public class AppRunner {
    public static void main(String[] args) {
        DatabaseConnection.getDatabaseConnection().select();
        DatabaseConnection.getDatabaseConnection().select();
        DatabaseConnection.getDatabaseConnection().insert();
    }
}
