package com.denissc.patterns.creational.factory;

public class TxtDocumentFileReader implements DocumentFileReader {

    @Override
    public void readFile(String filePath) {
        System.out.println("Reading txt file " + filePath);
    }
}
