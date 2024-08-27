package com.singleton;

public class LoggerTest {
    public static void main(String[] args) {
        // Get the instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Test if both instances are the same
        System.out.println("logger1 and logger2 are the same instance: " + (logger1 == logger2));

        // Use the logger to log a message
        logger1.log("This is a log message.");
    }
}
