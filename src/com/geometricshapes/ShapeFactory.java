package com.geometricshapes;

import java.util.Objects;

class ShapeFactory{

    public ShapeFactory() {
    }

    public static Shape getShape(String shapeType, String... parameters) {
        // IMPLEMENTIRATI ShapeFactory DA VRAĆA ISPRAVAN SHAPE U ZAVISNOSTI OD ULAZNIH PARAMETARA

        if (parameters.length == 1) {
        if(shapeType.equals("Circle")){
            Circle c = new Circle(Double.parseDouble(parameters[0]));
            return c;
          }
            if(shapeType.equals("Square")){
                Square s = new Square(Double.parseDouble(parameters[0]));
                return s;
            }
        }
        else{
            Rectangle r = new Rectangle(Double.parseDouble(parameters[0]),
                    Double.parseDouble(parameters[1]));
            return r;
        }

        return null;
    }
}
