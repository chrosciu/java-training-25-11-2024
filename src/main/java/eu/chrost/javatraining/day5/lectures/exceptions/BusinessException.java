package eu.chrost.javatraining.day5.lectures.exceptions;

public class BusinessException extends RuntimeException {
    public BusinessException(Exception e) {
        super(e);
    }
}
