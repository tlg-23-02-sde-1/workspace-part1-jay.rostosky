package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(3.6);
        shapes[1] = new Rectangle(2.5, 3.5);
        shapes[2] = new Triangle(5.0, 4.0);

        for (Shape shape : shapes) {
            double area = shape.area();
            System.out.println("The area is: " + area + "\n");
        }
    }
}