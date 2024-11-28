package eu.chrost.javatraining.day3.exercises.classes;

/*
Zadanie 1: Klasa Person
1.	Utwórz klasę Person z polami:
o	String name
o	int age
2.	Dodaj metodę instancyjną boolean isAdult(), która zwraca true, jeśli wiek osoby wynosi co najmniej 18 lat.
3.	W metodzie main():
o	Utwórz kilka obiektów klasy Person, ustawiając pola bezpośrednio.
o	Wyświetl wynik metody isAdult() dla różnych osób.

 */

public class Person {
    public String name;
    public int age;

    public boolean isAdult() {
        return age>18;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.age = 25;
        person.name = "Anna";

        Person person2 = new Person();
        person2.age = 17;
        person2.name = "Adrian";

        System.out.println("is " + person.name + " adult? " + person.isAdult());
        System.out.println("is " + person2.name + " adult? " + person2.isAdult());
    }
}
