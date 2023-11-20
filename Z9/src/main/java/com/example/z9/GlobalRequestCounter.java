package com.example.z9;

public class GlobalRequestCounter {
    private static int requestCount = 0;

    public static synchronized void incrementRequestCount() {
        requestCount++;
    }

    public static int getRequestCount() {
        return requestCount;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // Симулируем HTTP-запрос
            makeHttpRequest();
        }


        System.out.println("Общее количество запросов: " + getRequestCount());
    }

    private static void makeHttpRequest() {

        incrementRequestCount();


        HttpRequestHandler handler = new HttpRequestHandler();
        handler.processRequest();


        System.out.println("Запрос обработан. Общее количество запросов: " + getRequestCount());
    }
}
