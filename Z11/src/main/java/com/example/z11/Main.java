package com.example.z11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DocumentManager manager = new DocumentManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к исходному файлу: ");
        String originalFilePath = scanner.nextLine();

        System.out.print("Введите путь к новому файлу: ");
        String clonedFilePath = scanner.nextLine();

        try {
            ConcreteDocument originalDocument = ConcreteDocument.loadFromFile(originalFilePath);
            manager.addDocument("doc1", originalDocument);

            Document clonedDocument = manager.getDocument("doc1");
            ((ConcreteDocument) clonedDocument).saveToFile(clonedFilePath);

            System.out.println("Original Document Content: " + originalDocument.getContent());
            System.out.println("Cloned Document Content: " + clonedDocument.getContent());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}