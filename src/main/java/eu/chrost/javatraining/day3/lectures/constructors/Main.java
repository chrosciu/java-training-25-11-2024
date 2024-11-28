package eu.chrost.javatraining.day3.lectures.constructors;


import eu.chrost.javatraining.day3.lectures.constructors.circle.Circle;
import eu.chrost.javatraining.day3.lectures.constructors.person.Person;
import eu.chrost.javatraining.day3.lectures.constructors.point.Point;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(2.5, 3.5);
        System.out.println(p);

        System.out.println(p);
        System.out.println(p);
        System.out.println(p.getX());
        System.out.println(p.getY());


        Circle c1 = new Circle(1.5, p);
        System.out.println(c1);
        Circle c2 = new Circle(4.5);
        System.out.println(c2);
        Circle c3 = new Circle();
        System.out.println(c3);
        System.out.println(c3.getCenter());
        System.out.println(c3.getRadius());

        Person person = new Person(1982, "Marcin");
        System.out.println(person.name());
        System.out.println(person.birthYear());
        System.out.println(person);

        Person anotherPerson = new Person(1982, "Marcin");
        System.out.println(person.equals(anotherPerson));
    }
}
