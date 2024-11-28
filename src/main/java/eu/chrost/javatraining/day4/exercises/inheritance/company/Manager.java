package eu.chrost.javatraining.day4.exercises.inheritance.company;

public class Manager extends Employee {
    private String department;

    public Manager(String department, String name, double salary) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager of: [" + department + "], " + super.toString();
    }
}
