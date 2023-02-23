package edu.geometry;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override  // interface Shape
    public double area() {
        System.out.println("Circle area() called");
        return Math.PI * Math.pow(radius(), 2);  // "pi r squared"
    }

    public double radius() {
        return radius;
    }
}