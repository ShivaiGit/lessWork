package oop;

public class Employee extends Person {

    private int id;
    private  String department;

    public Employee(String name, String lastName, int id, String department) {
        super(name, lastName);
        this.id = id;
        this.department = department;
    }
}
