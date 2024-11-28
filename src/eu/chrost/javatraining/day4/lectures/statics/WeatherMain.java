package eu.chrost.javatraining.day4.lectures.statics;

public class WeatherMain {
    public static void main(String[] args) {
        Weather weather1 = Weather.getInstance();
        Weather weather2 = Weather.getInstance();
        System.out.println(weather1);
        System.out.println(weather2);
        System.out.println(weather1 == weather2);
        System.out.println(Weather.NAME);
    }
}
