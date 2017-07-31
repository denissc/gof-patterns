package com.denissc.patterns.creational.factory;

public class TxtDocumentFileReaderFactory implements DocumentFileReaderFactory {
    @Override
    public DocumentFileReader createDocumentFileReader() {
        return new TxtDocumentFileReader();
    }
}
