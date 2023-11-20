package com.example.z11;

// ConcreteDocument.java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ConcreteDocument implements Document {
    private String content;

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public Document clone() {
        try {
            ConcreteDocument clonedDocument = (ConcreteDocument) super.clone();
            clonedDocument.setContent(this.getContent());
            return clonedDocument;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void saveToFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        Files.write(path, this.content.getBytes());
        System.out.println("Document saved to: " + path.toAbsolutePath());
    }

    public static ConcreteDocument loadFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        String content = new String(Files.readAllBytes(path));

        ConcreteDocument document = new ConcreteDocument();
        document.setContent(content);

        System.out.println("Document loaded from: " + path.toAbsolutePath());

        return document;
    }
}
