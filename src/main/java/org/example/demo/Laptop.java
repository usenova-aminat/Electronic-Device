package org.example.demo;

public class Laptop extends Device {
    private int ramSize;
    private double processorType;

    public Laptop(String name, double price, double weight, int ramSize, double processorType) {
        super(Type.LAPTOP, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return super.toString() + ", ramSize: " + ramSize + ", processorType: " + processorType;
    }
}
