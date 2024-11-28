package eu.chrost.javatraining.day3.exercises.classes;

/*

Zadanie 2: Klasa Rectangle
1.	Utwórz klasę Rectangle z polami:
o	double length
o	double width
2.	Dodaj metody:
o	double calculateArea() – zwraca pole prostokąta.
o	double calculatePerimeter() – zwraca obwód prostokąta.
3.	W main():
o	Utwórz kilka obiektów klasy Rectangle, ustawiając wartości pól bezpośrednio.
o	Wyświetl pole i obwód prostokątów.
 */

public class Rectangle {
    public double length;
    public double width;

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return length * 2 + width * 2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 5;
        rectangle. width = 10;

        System.out.println("Pole prostokąta wynosi: " + (rectangle.calculateArea()));
        System.out.println("Obwód prostokąta wynosi: " + (rectangle.calculatePerimeter()));


    }
}
