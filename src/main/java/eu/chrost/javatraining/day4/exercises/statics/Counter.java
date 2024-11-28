package eu.chrost.javatraining.day4.exercises.statics;

/*

Zadanie 1: Licznik obiektów
1.	Utwórz klasę Counter z polami:
o	Prywatne statyczne pole int objectCount, które przechowuje liczbę utworzonych obiektów klasy.
o	Prywatne pole int id, przechowujące unikalny identyfikator obiektu.
2.	Dodaj:
o	Konstruktor, który zwiększa wartość objectCount i przypisuje jej wartość do pola id.
o	Metodę static int getObjectCount(), która zwraca liczbę utworzonych obiektów.
o	Metodę String toString() zwracającą tekstową reprezentację obiektu.
3.	W metodzie main():
o	Utwórz kilka obiektów klasy Counter.
o	Wyświetl ich id oraz liczbę utworzonych obiektów za pomocą getObjectCount().


 */

public class Counter {
    private static int objectCount;
    private final int id;

    public Counter() {
        ++objectCount;
        this.id = objectCount;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(getObjectCount());

        Counter c3 = new Counter();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(Counter.getObjectCount());
    }
}
