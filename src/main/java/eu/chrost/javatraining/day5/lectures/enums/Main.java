package eu.chrost.javatraining.day5.lectures.enums;

import static eu.chrost.javatraining.day5.lectures.enums.Color.BLACK;

public class Main {
    public static void main(String[] args) {
        Color color = Color.RED;
        Color black = BLACK;
        //Color color = new Color(); //does not compile

        System.out.println(color.getName());

        Color[] colors = Color.values();
        for (Color c : colors) {
            System.out.println(c);
        }

        switch(color) {
            case RED -> System.out.println("Red");
            default -> System.out.println("Yellow");
        }
    }
}
