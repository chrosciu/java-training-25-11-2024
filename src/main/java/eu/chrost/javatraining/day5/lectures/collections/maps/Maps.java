package eu.chrost.javatraining.day5.lectures.collections.maps;

import java.util.HashMap;
import java.util.Map;

import static eu.chrost.javatraining.day5.lectures.collections.maps.Color.BLACK;
import static eu.chrost.javatraining.day5.lectures.collections.maps.Color.RED;

enum Color {
    BLACK,
    RED,
    WHITE
}

public class Maps {
    public static void main(String[] args) {
        Map<Color, Integer> furniture = new HashMap<>();
        furniture.put(BLACK, 1);
        furniture.put(RED, 2);
        System.out.println(furniture);

        for (Map.Entry<Color, Integer> entry : furniture.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }

        furniture.put(BLACK, 3);
        System.out.println(furniture);
        furniture.remove(RED);
        System.out.println(furniture);

        System.out.println(furniture.get(BLACK));
        System.out.println(furniture.get(RED));
    }
}
