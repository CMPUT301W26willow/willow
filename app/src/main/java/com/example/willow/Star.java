package com.example.willow;

public class Star extends Shape {
    private Integer perimeterLength;
    public Star(Integer x, Integer y, Integer perimeterLength){
        super(x, y);
        this.perimeterLength = x*5 + y*5;
    }

}
