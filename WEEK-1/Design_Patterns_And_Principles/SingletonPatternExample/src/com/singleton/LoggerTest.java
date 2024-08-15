package com.singleton;

public class LoggerTest {
    public static void main(String[] args) {
<<<<<<< HEAD
        LoggerFactory factory = LoggerFactory.getInstance();

        Logger consoleLogger = factory.getLogger("console");
        Logger fileLogger = factory.getLogger("file");

        System.out.println(consoleLogger == ConsoleLogger.getInstance());
        System.out.println(fileLogger == FileLogger.getInstance());

        consoleLogger.log("Message for console logger.");
        fileLogger.log("Message for file logger.");
=======
        // Obtain instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Test if both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }

        // Log some messages
        logger1.log("This is a message from logger1.");
        logger2.log("This is a message from logger2.");
>>>>>>> a40c4ee (WEEK 1 5007942)
    }
}
