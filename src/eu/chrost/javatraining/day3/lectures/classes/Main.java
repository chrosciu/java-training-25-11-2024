package eu.chrost.javatraining.day3.lectures.classes;

import eu.chrost.javatraining.day3.lectures.classes.circle.Circle;
import eu.chrost.javatraining.day3.lectures.classes.point.Point;

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

        Point p3 = new Point();
        p3.x = 3;
        p3.y = 5;

        Point p4 = p2;

        System.out.println("p2 == p3: " + (p2 == p3));
        System.out.println("p2 == p4: " + (p2 == p4));

        System.out.println("p2 equals p3: " + (p2.equals(p3)));
        System.out.println("p2 equals p4: " + (p2.equals(p4)));
        System.out.println("p1 equals p2: " + (p1.equals(p2)));

        Object o = new Object();
        System.out.println(p1.equals(o));

        Circle c = new Circle();
        c.radius = 2.5;
        c.center = p1;
        System.out.println(c);


    }
}
