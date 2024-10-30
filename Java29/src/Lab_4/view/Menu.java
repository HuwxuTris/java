package Lab_4.view;

import Lab_4.services.Company;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private Company company = new Company();

    public void displayMenu() {
        int choice;
        do {
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Display All Employees");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            processChoice(choice);
        } while (choice != 0);
    }

    private void processChoice(int choice) {
        switch (choice) {
            case 1 -> company.addEmployee();
            case 2 -> company.removeEmployee();
            case 3 -> company.updateEmployeeSalary();
            case 4 -> company.displayEmployees();
            case 0 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid choice.");
        }
    }
}
