package com.denissc.patterns.creational.singleton;

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
