package eu.chrost.javatraining.day4.lectures.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Fiat");
        System.out.println(car);
        System.out.println(car.whoAmI());

        Truck truck = new Truck("Iveco", 30);
        System.out.println(truck);
        System.out.println(truck.whoAmI());

        Car car2 = truck;
        System.out.println((car2.whoAmI()));
        //Truck truck2 = car; //does not compile

        System.out.println(car instanceof Truck);
        //Truck truck2 = (Truck) car; //throws exception in runtime

        System.out.println(car2 instanceof Truck);
        Truck truck2 = (Truck) car2; //works



    }
}
