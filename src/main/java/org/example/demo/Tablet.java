package org.example.demo;

public class Tablet extends Device{
    private double batteryLife;
    private boolean hasStylus;
    public Tablet(String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(Type.TABLET, name, price, weight);
    }
    @Override
    public String toString() {
        return super.toString() + "\nbatteryLife: " + batteryLife + "\nhasStyls: " + hasStylus;
    }
}
