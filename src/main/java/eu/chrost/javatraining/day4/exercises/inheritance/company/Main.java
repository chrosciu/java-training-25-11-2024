package eu.chrost.javatraining.day4.exercises.inheritance.company;

/*
Zadanie 1: Polimorfizm w hierarchii pracowników
1.	Utwórz klasę Employee z polami:
o	String name (protected),
o	double salary (protected).
2.	Dodaj konstruktor oraz metodę toString(), która zwraca tekst: "Employee: [name], Salary: [salary]".
3.	Utwórz klasę Manager, która dziedziczy po Employee:
o	Dodaj pole String department (private).
o	Nadpisz metodę toString(), aby zawierała również informację o departamencie.
o	Wykorzystaj super.toString() w implementacji metody.
4.	W klasie Main utwórz tablicę pracowników (Employee[]), w której znajdą się zarówno obiekty Employee, jak i Manager. Wykorzystaj pętlę, aby wyświetlić dane wszystkich pracowników.


*/

public class Main {
    public static void main(String[] args) {
         Employee[] employees = new Employee[3];

         Employee e1 = new Employee( "Piotr", 345.89);
         Employee e2 = new Employee( "Jan", 1234.89);
         Manager m1 = new Manager("Sales","Roman", 4567.89);

         employees[0] = e1;
         employees[1] = m1;
         employees[2] = e2;

         for (Employee e : employees) {
             System.out.println(e);
         }
    }
}
