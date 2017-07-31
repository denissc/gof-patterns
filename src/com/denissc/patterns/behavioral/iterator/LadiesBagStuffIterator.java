package com.denissc.patterns.behavioral.iterator;

public class LadiesBagStuffIterator {
    public static void main(String[] args) {
        String[] bagStuff = {
                "Phone", "Mirror", "Glass", "Goggles"
        };
        LadiesBag bag = new LadiesBag(bagStuff);

        Iterator iterator = bag.getIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
