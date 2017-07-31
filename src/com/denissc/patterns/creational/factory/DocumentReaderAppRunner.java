package com.denissc.patterns.creational.factory;

public class DocumentReaderAppRunner {
    public static void main(String[] args) {
        DocumentFileReaderFactory readerFactory = createDocumentFileReaderFactoryByFileType("pdf");
        DocumentFileReader documentFileReader = readerFactory.createDocumentFileReader();

        documentFileReader.readFile("/path/to/the/file");
    }

    private static DocumentFileReaderFactory createDocumentFileReaderFactoryByFileType(String documentExtension) {
        if (documentExtension.equalsIgnoreCase("txt")) {
            return new TxtDocumentFileReaderFactory();
        } else if(documentExtension.equalsIgnoreCase("pdf")) {
            return new PdfDocumentFileReaderFactory();
        } else {
            throw new RuntimeException(documentExtension + " is not supported");
        }

    }
}
