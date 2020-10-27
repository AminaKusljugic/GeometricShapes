package com.geometricshapes;

    public class Main{
        // METODU main NE MIJENJATI - KORISTITI ZA TESTIRANJE U OVOM FORMATU
        public static void main(String[] args) throws Exception {
            Shape shape = ShapeFactory.getShape("Circle", "1.3");
            printShapeInfo(shape);

            Shape shape2 = ShapeFactory.getShape("Square", "5.3");
            printShapeInfo(shape2);

            Shape shape3 = ShapeFactory.getShape("Rectangle", "2.3", "4");
            printShapeInfo(shape3);
        }

        private static void printShapeInfo(Shape shape) throws Exception {

        System.out.println("\nSHAPE INFO:");

        if (shape instanceof  Circle){
            System.out.println(shape.getName() + " area: " + ((Circle)shape).getArea());
            System.out.println(shape.getName() + " radius: " + ((Circle)shape).getRadius());
        } else if (shape instanceof Square){
            System.out.println(shape.getName() + " area: " + ((Square) shape).getArea());
            System.out.println(shape.getName() + " perimeter: " + ((Square) shape).getPerimeter());
        } else if (shape instanceof Rectangle){
            System.out.println(shape.getName() + " area: " + ((Rectangle) shape).getArea());
            System.out.println(shape.getName() + " perimeter: " + ((Rectangle) shape).getPerimeter());
        } else {
            throw new Exception("Unknown shape!");
        }

        }
    }

