package com.document.factory;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document Factory  Method Pattern.");
        System.out.println("Opening Word Document...");
    }

    @Override
    public void close() {
        System.out.println("Closing Word Document Factory  Method Pattern.");
        System.out.println("Closing Word Document...");
    }

    @Override
    public void save() {
        System.out.println("Saving Word Document Factory  Method Pattern.");
        System.out.println("Saving Word Document...");
    }
}
