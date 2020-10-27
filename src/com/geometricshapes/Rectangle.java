package com.geometricshapes;

public class Rectangle extends Shape implements Polygon {
    double a, b;

    public Rectangle() {
        super("Rectangle");
    }

    public Rectangle(double a, double b) {
        super("Rectangle");
        this.a = a;
        this.b = b;
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
