package com.builder;

public class BuilderPatternTest {
    public static void main(String[] args) {
<<<<<<< HEAD
=======
        // Creating a basic computer
>>>>>>> a40c4ee (WEEK 1 5007942)
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("500GB SSD")
                .build();
<<<<<<< HEAD
=======

>>>>>>> a40c4ee (WEEK 1 5007942)
        System.out.println("Basic Computer:");
        System.out.println("CPU: " + basicComputer.getCPU());
        System.out.println("RAM: " + basicComputer.getRAM());
        System.out.println("Storage: " + basicComputer.getStorage());
        System.out.println("Graphics Card Enabled: " + basicComputer.isGraphicsCardEnabled());
        System.out.println("Bluetooth Enabled: " + basicComputer.isBluetoothEnabled());
<<<<<<< HEAD
=======

        // Creating a high-end computer with additional features
>>>>>>> a40c4ee (WEEK 1 5007942)
        Computer highEndComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .enableGraphicsCard(true)
                .enableBluetooth(true)
<<<<<<< HEAD
               .build();
=======
                .build();

>>>>>>> a40c4ee (WEEK 1 5007942)
        System.out.println("\nHigh-End Computer:");
        System.out.println("CPU: " + highEndComputer.getCPU());
        System.out.println("RAM: " + highEndComputer.getRAM());
        System.out.println("Storage: " + highEndComputer.getStorage());
        System.out.println("Graphics Card Enabled: " + highEndComputer.isGraphicsCardEnabled());
        System.out.println("Bluetooth Enabled: " + highEndComputer.isBluetoothEnabled());
    }
}
