package com.denissc.patterns.creational.builder;

public class Car {
    private CarType type;
    private String mark;
    private int price;

    public void setType(CarType type) {
        this.type = type;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type=" + type +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                '}';
    }
}
