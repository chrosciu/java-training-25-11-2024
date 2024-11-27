package eu.chrost.javatraining.day3.exercises.constructors.students;

/*
Zadanie 4: System ocen studenta
1.	Utwórz klasę Student z prywatnymi polami:
o	String name
o	int id
o	double gpa
Na podstawie dalszej tresci zadania, ustal ktore pola powinny byc finalne
2.	Dodaj publiczne metody:
o	Konstruktor inicjalizujący wszystkie pola.
o	Gettery dla wszystkich pól.
o	void updateGPA(double newGpa) – pozwala zmienić GPA, jeśli newGpa mieści się w przedziale 0–4.
o	String toString() – zwraca informacje o studencie.
3.	W klasie Main metode main(), która:
o	Tworzy kilku studentów i wyświetla ich dane.
o	Modyfikuje ich GPA, sprawdzając poprawność danych wejściowych.

 */

public class Student {
    private final String name;
    private final int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = isValidGPA(gpa) ? gpa : 0;
    }

    public void updateGPA(double gpa) {
        if (isValidGPA(gpa)) {
            this.gpa = gpa;
        }
    }

    private boolean isValidGPA(double gpa) {
        return (0 <= gpa) && (gpa <= 4);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }
}
