package eu.chrost.javatraining.day5.lectures.enums;

public enum Color {
    BLACK("black"),
    WHITE("white"),
    RED("red");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
