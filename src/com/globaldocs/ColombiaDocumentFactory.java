package com.globaldocs;

public class ColombiaDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String type) {
        switch (type.toLowerCase()) {
            case "invoice": return new ColombianInvoice();
            case "contract": return new ColombianContract();
            default: throw new IllegalArgumentException("Unknown Colombian document: " + type);
        }
    }
}
