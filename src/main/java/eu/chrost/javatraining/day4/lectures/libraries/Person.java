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

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
