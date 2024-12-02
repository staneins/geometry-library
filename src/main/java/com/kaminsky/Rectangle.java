package com.kaminsky;

public class Rectangle extends AbstractFigure {
    private double height;
    private double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.height = length;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return (height + width) * 2;
    }
}
