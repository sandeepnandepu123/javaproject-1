package com.Streams;

public class Product {
    private int id;
    private String name;
    private double price;
    private String origin;
    private String type;

    public Product(int id, String name, double price, String origin, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.origin = origin;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
