package com.example.willow;

public class Triangle extends Shape {

    private Integer base;
    private Integer height;

    public Triangle(Integer x, Integer y, Integer base, Integer height) {
        super(x, y);         
        this.base = base;
        this.height = height;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

}
