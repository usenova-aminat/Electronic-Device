package org.example.demo;

public class Device {
    enum Type { SMARTPHONE, LAPTOP, TABLET }

    private Type type;
    private String name;
    private double price;
    private double weight;

    public Device(Type type, String name, double price, double weight) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Type: " + type + "\n" +
                "Name: " + name + "\n" +
                "Price: " + price + "\n" +
                "Weight: " + weight;
    }

}


