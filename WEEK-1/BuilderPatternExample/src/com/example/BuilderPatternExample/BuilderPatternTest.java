package com.example.BuilderPatternExample;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Creating different configurations of Computer using the Builder pattern
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA GTX 3080")
                .setBluetooth(true)
                .setWiFi(true)
                .build();

        // Output the configurations
        System.out.println("Basic Computer Configuration:");
        System.out.println("CPU: " + basicComputer.getCPU());
        System.out.println("RAM: " + basicComputer.getRAM());
        System.out.println("Storage: " + basicComputer.getStorage());
        System.out.println("GPU: " + basicComputer.getGPU());

        System.out.println("\nGaming Computer Configuration:");
        System.out.println("CPU: " + gamingComputer.getCPU());
        System.out.println("RAM: " + gamingComputer.getRAM());
        System.out.println("Storage: " + gamingComputer.getStorage());
        System.out.println("GPU: " + gamingComputer.getGPU());
        System.out.println("Bluetooth: " + gamingComputer.hasBluetooth());
        System.out.println("WiFi: " + gamingComputer.hasWiFi());
    }
}
