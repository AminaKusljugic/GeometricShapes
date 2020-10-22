package com.geometricshapes;

    public class Main {
        // METODU main NE MIJENJATI - KORISTITI ZA TESTIRANJE U OVOM FORMATU
        public static void main(String[] args) throws Exception {
            Shape shape = ShapeFactory.getShape("Circle", "1.3");
            printShapeInfo(shape);

            Shape shape2 = ShapeFactory.getShape("Square", "5.3");
            printShapeInfo(shape2);

            Shape shape3 = ShapeFactory.getShape("Rectangle", "2.3", "4");
            printShapeInfo(shape3);
        }

        // UKLONITI KOMENTARE SA printShapeInfo METODE KADA IMPLEMENTIRATE SVE IZNAD!
        // ISPRAVITI GREŠKE U printShapeInfo METODI - ZAMIJENITI '?' ISPRAVNIM VRIJEDNOSTIMA
        private static void printShapeInfo(Shape shape) throws Exception {
        /*
        System.out.println("\nSHAPE INFO:");
        if (shape instanceof ?) {
            System.out.println(shape.getName() + " ?: " + ((?) shape).?());
            System.out.println(shape.getName() + " ?: " + ((?) shape).?());
        } else if (shape instanceof ?) {
            System.out.println(shape.getName() + " ?: " + ((?) shape).?());
            System.out.println(shape.getName() + " ?: " + ((?) shape).?());
        } else if (shape instanceof ?) {
            System.out.println(shape.getName() + " ?: " + ((?) shape).?());
            System.out.println(shape.getName() + " ?: " + ((?) shape).?());
        } else {
            throw new Exception("Unknown shape!");
        }
        */
        }
    }

