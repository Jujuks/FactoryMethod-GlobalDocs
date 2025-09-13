package com.globaldocs;

public class MexicoDocumentFactory extends DocumentFactory {
    
    public Document createDocument(String type) {
        switch (type.toLowerCase()) {
            case "invoice": return new MexicanInvoice();
            case "contract": return new MexicanContract();
            default: throw new IllegalArgumentException("Unknown Mexican document: " + type);
        }
    }
}
