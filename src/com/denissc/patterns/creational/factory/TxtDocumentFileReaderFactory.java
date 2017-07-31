package com.denissc.patterns.creational.factory;

/**
 * Created by denissc on 25.07.17.
 */
public class TxtDocumentFileReaderFactory implements DocumentFileReaderFactory {
    @Override
    public DocumentFileReader createDocumentFileReader() {
        return new TxtDocumentFileReader();
    }
}
