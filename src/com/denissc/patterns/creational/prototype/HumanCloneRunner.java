package com.denissc.patterns.creational.prototype;

/**
 * Created by denissc on 26.07.17.
 */
public class HumanCloneRunner {
    public static void main(String[] args) {
        Human human = new Human("Vasya", 23, "scientist");

        System.out.println(human);

        HumanFactory factory = new HumanFactory(human);

        Human humanClone = factory.cloneHuman();

        System.out.println(humanClone);
    }
}
