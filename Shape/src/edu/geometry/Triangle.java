package edu.geometry;

public class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override  // interface Shape
    public double area() {
        System.out.println("Triangle area() called");
        return 0.5 * base() * height();  // "one-half base times height"
    }

    public double base() {
        return base;
    }

    public double height() {
        return height;
    }
}