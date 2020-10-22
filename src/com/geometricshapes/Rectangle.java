package com.geometricshapes;

public class Rectangle implements Polygon {
    double a, b;

    public Rectangle() {
    }

    public Rectangle(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        double area = a * b;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (2 * a) + (2 * b);
        return perimeter;
    }
}
