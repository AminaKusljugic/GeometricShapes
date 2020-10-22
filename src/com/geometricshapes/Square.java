package com.geometricshapes;

public class Square implements Polygon {
    private double x;

    public Square() {
    }

    public Square(double x) {
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
