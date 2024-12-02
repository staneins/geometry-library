package com.kaminsky;

public class Triangle extends AbstractFigure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double side1, double side2, double side3) {
        this.sideA = side1;
        this.sideB = side2;
        this.sideC = side3;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter * sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}
