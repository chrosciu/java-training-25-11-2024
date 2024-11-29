package eu.chrost.javatraining.day5.lectures.abstracts;

import static eu.chrost.javatraining.day5.lectures.abstracts.Huggable.HUG;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Maja");
        Cat cat = new Cat("Kofeinka");
        //Animal animal = new Animal(); //does not compile
        Animal animal = dog;
        Printable printable = cat;
        if (printable instanceof Cat) {
            Cat c = (Cat) printable;
        }

        displayAnimalName(animal);
        displayAnimalName(dog);
        displayAnimalName(cat);

        displayAnimalVoice(animal);
        displayAnimalVoice(dog);
        displayAnimalVoice(cat);

        print(dog);
        print(cat);

        dog.hug();

        System.out.println(HUG);
    }

    private static void displayAnimalName(Animal animal) {
        System.out.println(animal.getName());
    }

    private static void displayAnimalVoice(Animal animal) {
        System.out.println(animal.getVoice());
    }

    private static void print(Printable printable) {
        System.out.println(printable.print());
        System.out.println(printable.printWithUpperCase());
    }
}
