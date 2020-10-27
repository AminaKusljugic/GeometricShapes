package com.geometricshapes;

public class Square extends Shape implements Polygon {
    private double x;

    public Square() {
        super("Square");
    }

    public Square(double x) {
        super("Square");
        this.x = x;
    }

    @Override
    public double getArea() {
        double area = x * x;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4 * x;
        return perimeter;
    }
}
