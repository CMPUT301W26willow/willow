package com.example.willow;

public class Hexagon extends Shape {

    private double side;

    public Hexagon(Integer x, Integer y, double side) {
        super(x, y);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
