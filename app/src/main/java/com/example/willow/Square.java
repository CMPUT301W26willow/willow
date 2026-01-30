package com.example.willow;

public class Square extends Shape{
    private Integer sideMeasurement;
    public Square(Integer x, Integer y, Integer sideMeasurement) {
        super(x, y);
        this.sideMeasurement = sideMeasurement;
    }
}
