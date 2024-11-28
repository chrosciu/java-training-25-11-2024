package eu.chrost.javatraining.day3.lectures.classes.circle;

import eu.chrost.javatraining.day3.lectures.classes.point.Point;

public class Circle {
    public double radius;
    public Point center;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
