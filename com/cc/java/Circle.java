package com.cc.java;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double width;
    @Override
    public double Area() {
        return Math.PI * Math.pow(this.radius,2);
    }
}
