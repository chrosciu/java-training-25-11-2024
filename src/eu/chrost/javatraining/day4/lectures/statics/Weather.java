package eu.chrost.javatraining.day4.lectures.statics;

import java.util.Random;

public class Weather {
    public static final String NAME = "Weather Station";

    private static Weather instance;

    private final double temperature;
    private final double humidity;

    public static Weather getInstance() {
        if (instance == null) {
            instance = new Weather();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

    private Weather() {
        Random random = new Random();
        this.temperature = random.nextDouble(35);
        this.humidity = random.nextDouble(100);
    }
}
