package com.cc.java;

public class Rectangle extends Shape {

    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    private double width;
    @Override
    public double Area() {
        return this.height * this.width;
    }

}
