package eu.chrost.javatraining.day4.lectures.libraries;

import com.google.gson.Gson;

public class PersonSerializationDemo {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Person person = new Person("Marcin", "Chrost", 42, 60);

        String json = gson.toJson(person);
        System.out.println(json);

        Person person2 = gson.fromJson(json, Person.class);
        System.out.println(person2);
    }
}
