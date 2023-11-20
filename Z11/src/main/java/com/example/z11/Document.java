package com.example.z11;

public interface Document extends Cloneable {
    void setContent(String content);
    String getContent();
    Document clone();
}