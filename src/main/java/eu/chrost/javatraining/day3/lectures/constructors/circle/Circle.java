package eu.chrost.javatraining.day3.lectures.constructors.circle;

import eu.chrost.javatraining.day3.lectures.constructors.point.Point;

public class Circle {
    private final double radius;
    private final Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius) {
        this(radius, new Point(0, 0));
    }

    public Circle() {
        this(0);
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
