package eu.chrost.javatraining.day3.lectures.classes.point;

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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point p) {
            return p.x == this.x && p.y == this.y;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
