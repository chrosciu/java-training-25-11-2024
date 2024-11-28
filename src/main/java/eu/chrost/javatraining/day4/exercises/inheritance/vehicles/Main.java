package eu.chrost.javatraining.day4.exercises.inheritance.vehicles;

/*
Zadanie 2: Polimorfizm w pojazdach

1.	Utwórz klasę Vehicle z metodą:
o	public String getType(), która zwraca tekst "Generic Vehicle".
2.	Utwórz klasy Car i Truck, które dziedziczą po Vehicle:
o	Nadpisz metodę getType() w obu klasach, aby zwracała odpowiednio "Car" i "Truck".
3.	W metodzie main utwórz tablice pojazdów (Vehicle[]) zawierającą różne typy pojazdów.
Wykorzystaj polimorfizm, aby wywołać metodę getType() na każdym obiekcie.

 */

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new Truck();

        vehicles[0] = v1;
        vehicles[1] = v2;
        vehicles[2] = v3;


        for (Vehicle v : vehicles) {
            System.out.println(v.getType());
        }
    }
}
