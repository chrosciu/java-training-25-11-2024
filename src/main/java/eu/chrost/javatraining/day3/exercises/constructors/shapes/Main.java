package eu.chrost.javatraining.day3.exercises.constructors.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 10.0);
        Rectangle rect2 = new Rectangle(3.0, 4.0);
        Rectangle rect3 = new Rectangle();
        Rectangle rect4 = new Rectangle(-1.0, -2.0);

        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Rectangle 1 length: " + rect1.getLength());
        System.out.println("Rectangle 1 width: " + rect1.getWidth());
        System.out.println("Rectangle 1 area: " + rect1.area());
        System.out.println("Rectangle 1 perimeter: " + rect1.perimeter());
        System.out.println("Rectangle 2: " + rect2);
        System.out.println("Rectangle 3: " + rect3);
        System.out.println("Rectangle 4: " + rect4);
   }
}
