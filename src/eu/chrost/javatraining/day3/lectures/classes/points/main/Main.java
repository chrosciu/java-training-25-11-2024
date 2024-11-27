package eu.chrost.javatraining.day3.lectures.classes.points.main;

import eu.chrost.javatraining.day3.lectures.classes.points.point.Point;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 3.5;
        p1.y = 2.5;
        double distanceFromZero = p1.distanceFromZero();

        System.out.println("Point: " + p1.x + ", " + p1.y + ", distance from zero: " + distanceFromZero);
        System.out.println(p1);

        Point p2 = new Point();
        p2.x = 3;
        p2.y = 5;
        double distanceBetweenPoints = p1.distanceFrom(p2);
        System.out.println("Distance between points " + distanceBetweenPoints);

        p1.setX(7);
        System.out.println(p1.x);
    }
}
