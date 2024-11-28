package eu.chrost.javatraining.day4.lectures.libraries;

/*
Zadanie - dodac pole:
     double weight
do klasy Person i zobaczyc czy serializacja / deserializacja dalej dziala
 */

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final double weight;

    public Person(String firstName, String lastName, int age, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
