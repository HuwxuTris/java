package Lab_4.services;

import Lab_4.entities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addEmployee() {
        System.out.print("Enter employee type (1: Administrative, 2: Manager, 3: Sales): ");
        int type = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Monthly Salary: ");
        double monthlySalary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Employee employee = switch (type) {
            case 1 -> new AdministrativeEmployee(name, monthlySalary);
            case 2 -> {
                System.out.print("Enter Responsibility Allowance: ");
                double allowance = scanner.nextDouble();
                scanner.nextLine();
                yield new Manager(name, monthlySalary, allowance);
            }
            case 3 -> {
                System.out.print("Enter Sales Amount: ");
                double salesAmount = scanner.nextDouble();
                System.out.print("Enter Commission Rate: ");
                double commissionRate = scanner.nextDouble();
                scanner.nextLine();
                yield new SalesEmployee(name, monthlySalary, salesAmount, commissionRate);
            }
            default -> null;
        };

        if (employee != null) {
            employees.add(employee);
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Invalid employee type.");
        }
    }

    public void updateEmployeeSalary() {
        System.out.print("Enter Employee ID to update: ");
        int id = Integer.parseInt(scanner.nextLine()); // Changed to int
        System.out.print("Enter new Monthly Salary: ");
        double newSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        for (Employee employee : employees) {
            if (employee.id == id) {
                employee.monthlySalary = newSalary;
                System.out.println("Employee salary updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = Integer.parseInt(scanner.nextLine()); // Changed to int

        boolean removed = employees.removeIf(employee -> employee.id == id);
        if (removed) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void displayEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
