package eu.chrost.javatraining.day3.exercises.classes;

/*

Zadanie 4: Klasa Car
1.	Utwórz klasę Car z polami:
o	String brand
o	String model
o	int year
2.	Dodaj metodę:
o	boolean isOlderThan(int year) – sprawdza, czy samochód jest starszy niż podany rok.
3. Nadpisz metode equals() - tak aby porownywala czy dwa samochody maja te same wartosci pol
4. Nadpisz metode toString() - tak aby zwracala wartosci pol
5.	W main():
o	Utwórz kilka obiektów klasy Car, ustawiając wartości pól bezpośrednio.
o	Wywołaj metodę isOlderThan() dla różnych samochodów.
o	Porównaj obiekty za pomocą equals() i ==.
o   Wypisz zawartosc obiektu na konsole


 */

import java.util.Objects;

public class Car {
    public String brand;
    public String model;
    public int year;

    public boolean isOlderThan(int year) {
        return this.year > year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car car) {
            return Objects.equals(car.brand, this.brand)
                    && Objects.equals(car.model, this.model)
                    && car.year == this.year;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Opel";
        c1.model = "Meriva";
        c1.year = 2012;

        Car c2 = new Car();
        c2.brand = "Ford";
        c2.model = "Fiesta";
        c2.year = 2005;

        Car c3 = new Car();
        c3.brand = new String("Opel");
        c3.model = "Meriva";
        c3.year = 2012;

        System.out.println("Czy c1 jest starszy od 2000: " + c1.isOlderThan(2000));
        System.out.println("Czy c1 jest starszy od 2024: " + c1.isOlderThan(2024));
        System.out.println("Czy c1 to jest c2: " + c1.equals(c2));
        System.out.println("Czy c1 to jest c3: " + c1.equals(c3));
        System.out.println(c1);


    }
}
