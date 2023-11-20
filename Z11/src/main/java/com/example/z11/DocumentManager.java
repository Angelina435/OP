package com.example.z11;


import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private Map<String, Document> documentMap = new HashMap<>();

    public void addDocument(String key, Document document) {
        documentMap.put(key, document);
    }

    public Document getDocument(String key) {
        Document document = documentMap.get(key);
        if (document != null) {
            return document.clone();
        }
        return null;
    }
}
