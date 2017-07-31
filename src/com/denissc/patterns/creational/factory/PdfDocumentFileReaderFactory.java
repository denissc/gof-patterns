package com.denissc.patterns.creational.factory;

public class PdfDocumentFileReaderFactory implements DocumentFileReaderFactory {
    @Override
    public DocumentFileReader createDocumentFileReader() {
        return new PdfDocumentFileReader();
    }
}
