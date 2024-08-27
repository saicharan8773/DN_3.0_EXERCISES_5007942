package com.example.ProxyPatternExample;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        image1.display();
        System.out.println("");

        // Image will not be loaded again, will use cached version
        image1.display();
        System.out.println("");

        // Image will be loaded from disk (remote server)
        image2.display();
        System.out.println("");

        // Image will not be loaded again, will use cached version
        image2.display();
    }
}
