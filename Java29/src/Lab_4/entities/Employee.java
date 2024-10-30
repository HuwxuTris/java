package Lab_4.entities;

public abstract class Employee {
    public static int autoId;
    public int id;
    public String name;
    public double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.id = ++autoId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public abstract double calculateIncome();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Income: " + calculateIncome();
    }
}
