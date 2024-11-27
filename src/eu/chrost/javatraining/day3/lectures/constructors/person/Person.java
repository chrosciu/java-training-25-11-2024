package eu.chrost.javatraining.day3.lectures.constructors.person;

public record Person(int birthYear, String name) {
    public Person(String name) {
        this(1982, name);
    }
}
