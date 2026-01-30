    package com.example.willow;

    public class Circle extends Shape {

        private Integer radius;

        public Circle(Integer x, Integer y, Integer radius) {
            super(x, y);
            this.radius = radius;
        }

        public Integer getRadius() {
            return radius;
        }

        public void setRadius(Integer radius) {
            this.radius = radius;
        }
    }
