package com.geometricshapes;

class Circle extends Shape implements Sphere {

    private final double PI = 3.14;
    private double r;

    public Circle() {
        super("Circle");
    }

    public Circle(double r) {
        super("Circle");
        this.r = r;
    }

    @Override
    public double getArea() {
        double area = (r * r) * PI;
        return area;
    }

    @Override
    public double getRadius() {
        double radius = 2 * r * PI;
        return radius;
    }


}
