package eu.chrost.javatraining.day2.exercises.methods;

/*Zadanie 2: Obliczanie pola

1.	Dodaj do klasy AreaCalculator metody:
o	area(double radius) – zwraca pole koła (Math.PI * radius * radius).
o	area(double length, double width) – zwraca pole prostokąta.
o	area(double base, double height, boolean isTriangle) – zwraca pole trójkąta, jeśli isTriangle jest true, lub 0 w przeciwnym razie.
2.	W main() przetestuj metody dla różnych wartości.
*/

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(3.5));

        System.out.println(area(7.5, 8.5));

        System.out.println(area(2.5, 3.5, true));
        System.out.println(area(2.5, 3.5, false));
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(double base, double height, boolean isTriangle) {
        if (!isTriangle) {
            return 0;
        }
        return base * height / 2;
    }
}
