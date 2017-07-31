package com.denissc.patterns.creational.factory;

public class PdfDocumentFileReader implements DocumentFileReader {
    @Override
    public void readFile(String filePath) {
        System.out.println("Reading pdf file from path " + filePath);
    }
}
