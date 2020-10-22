package com.geometricshapes;

class Circle implements Sphere {
    private final double PI = 3.14;
    private double r;

    public Circle(double r) {
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
