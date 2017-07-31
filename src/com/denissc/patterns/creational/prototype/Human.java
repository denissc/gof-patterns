package com.denissc.patterns.creational.prototype;

/**
 * Created by denissc on 26.07.17.
 */
public class Human implements Clonable{
    private String name;
    private int age;
    private String specilaty;

    public Human(String name, int age, String specialty) {
        this.name = name;
        this.age = age;
        this.specilaty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecilaty() {
        return specilaty;
    }

    public void setSpecilaty(String specilaty) {
        this.specilaty = specilaty;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specilaty='" + specilaty + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        return new Human(name, age, specilaty);
    }
}
