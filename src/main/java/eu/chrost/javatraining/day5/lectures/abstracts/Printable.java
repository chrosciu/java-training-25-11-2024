package eu.chrost.javatraining.day5.lectures.abstracts;

public interface Printable {
    String print();

    default String printWithUpperCase() {
        return print().toUpperCase();
    }
}
