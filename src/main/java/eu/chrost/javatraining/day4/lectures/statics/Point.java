package eu.chrost.javatraining.day4.lectures.statics;

public class Point {
    private final double x;
    private final double y;

    private static int counter = 0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        ++counter;
    }

    public double distanceFrom(Point p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2.0) + Math.pow(p.y - this.y, 2.0));
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.5);
        Point p2 = new Point(2, 3);
        System.out.println(Point.getCounter());
    }
}
