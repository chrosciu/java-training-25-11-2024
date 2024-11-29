package eu.chrost.javatraining.day5.lectures.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> texts = new HashSet<>();

        texts.add("Marcin");
        texts.add("Tomasz");
        texts.add("Marcin");
        texts.add("Pawel");

        System.out.println(texts);
    }
}
