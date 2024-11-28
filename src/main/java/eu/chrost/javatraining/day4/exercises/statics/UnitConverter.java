package eu.chrost.javatraining.day4.exercises.statics;

/*

Zadanie 4: Konwersje jednostek
1.	Utwórz klasę UnitConverter z polami:
o	Stałe static final double KM_TO_MILES = 0.621371.
2.	Dodaj statyczne metody:
o	double kilometersToMiles(double km) – konwertuje kilometry na mile.
o	double milesToKilometers(double miles) – konwertuje mile na kilometry.
3.	W metodzie main():
o	Wykorzystaj metody do przeliczania kilku wartości i wyświetl wyniki
 */

public class UnitConverter {
    public static final double KM_TO_MILES = 0.621371;

    static double kilometersToMiles(double km) {
        return km * KM_TO_MILES;
    }

    static double milesToKilometers(double miles) {
        return miles / KM_TO_MILES;
    }

    private UnitConverter() {}

    public static void main(String[] args) {
        System.out.println(UnitConverter.kilometersToMiles(20));
        System.out.println(UnitConverter.milesToKilometers(20));
    }
}
