package eu.chrost.javatraining.day5.lectures.exceptions;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}
