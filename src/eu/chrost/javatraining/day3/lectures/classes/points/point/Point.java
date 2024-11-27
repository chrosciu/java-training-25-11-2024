package eu.chrost.javatraining.day3.lectures.classes.points.point;

public class Point {
    public double x;
    public double y;

    public double distanceFromZero() {
        return Math.sqrt((x * x) + (y * y));
    }

    public double distanceFrom(Point p) {
        return Math.sqrt(((x - p.x) * (x - p.x)) + ((y - p.y) * (y - p.y)));
    }

    public void setX(double x) {
        this.x = x;
    }
}
