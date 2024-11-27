package eu.chrost.javatraining.day3.exercises.constructors.shapes;

/*
Zadanie 3: Klasa Rectangle z ograniczonym dostępem
1.	Utwórz klasę Rectangle z prywatnymi i finalnymi polami:
o	double length
o	double width
2.	Dodaj publiczne metody:
o	Konstruktor ustawiający wartości pól (muszą być > 0, w przeciwnym razie ustaw domyślnie na 1).
o   Konstruktor bezparametrowy (ustawia obie wartosci na 1)
o	Gettery dla obu pól.
o	Metody double area() i double perimeter(), które zwracają odpowiednio pole i obwód prostokąta.
3.	W klasie Main metode main(), która:
o	Tworzy obiekt klasy Rectangle za pomocą konstruktora.
o   Wypisuje na ekran zawartosc stworzonego prostokata (hint: w klasie Rectangle czegos moze brakowac :))
o	Wywołuje metody do obliczeń i wyświetla wyniki.
 */

public class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length > 0 ? length : 1;
        this.width = width > 0 ? width : 1;
    }

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
