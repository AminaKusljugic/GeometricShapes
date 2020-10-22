package com.geometricshapes;

import java.util.Objects;

class ShapeFactory extends Shape{
    Square square = new Square();
    Rectangle rectangle = new Rectangle();


    public ShapeFactory(String name) {
        super(name);
    }

    public static Shape getShape(String shapeType, String... parameters) {
        // IMPLEMENTIRATI ShapeFactory DA VRAĆA ISPRAVAN SHAPE U ZAVISNOSTI OD ULAZNIH PARAMETARA
        if (parameters.length == 1) {
        if(shapeType.equals("Circle")){
            double parameter;
              parameter = Double.parseDouble(parameters[0]);
              Circle circle = new Circle(parameter);
              
          }

        }


        return null;
    }
}
