package eu.chrost.javatraining.day3.exercises.constructors.students;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Marcin", 1, 3.5);
        System.out.println(s1);
        s1.updateGPA(5.6);
        System.out.println(s1);
        s1.updateGPA(3.8);
        System.out.println(s1);
    }
}
