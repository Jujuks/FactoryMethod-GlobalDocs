package com.globaldocs;

import java.util.Arrays;
import java.util.List;

public class GlobalDocsApp {
    public static void main(String[] args) {
     
        DocumentFactory colombiaFactory = new ColombiaDocumentFactory();
        List<String> colombianDocs = Arrays.asList("invoice", "contract", "report");

        System.out.println("\n--- Processing Colombian documents ---");
        processBatch(colombiaFactory, colombianDocs);

        DocumentFactory mexicoFactory = new MexicoDocumentFactory();
        List<String> mexicanDocs = Arrays.asList("invoice", "contract");

        System.out.println("\n--- Processing Mexican documents ---");
        processBatch(mexicoFactory, mexicanDocs);
    }

    private static void processBatch(DocumentFactory factory, List<String> docs) {
        for (String type : docs) {
            try {
                Document doc = factory.createDocument(type);
                doc.process();
            } catch (Exception e) {
                System.out.println("❌ Error processing document: " + type + " -> " + e.getMessage());
            }
        }
    }
}
