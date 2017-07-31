package com.denissc.patterns.behavioral.iterator;

public class LadiesBag implements Collection {
    private String[] stuff;

    public LadiesBag(String[] stuff) {
        this.stuff = stuff;
    }

    @Override
    public Iterator getIterator() {
        return new StuffIterator();
    }

    private class StuffIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < stuff.length;
        }

        @Override
        public Object next() {
            return stuff[index++];
        }
    }
}
