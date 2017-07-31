package com.denissc.patterns.creational.singleton;

/**
 * Created by denissc on 25.07.17.
 */
public class DatabaseConnection {
    private  static DatabaseConnection databaseConnection;

    private DatabaseConnection(){}

    public static DatabaseConnection getDatabaseConnection(){
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }

        return databaseConnection;
    }

    void select(){
        System.out.println("SELECT QUERY");
    }

    void insert(){
        System.out.println("INSERT QUERY");
    }
}
