package Lab_3.view;
import Lab_3.services.WorkerService;

import java.util.Scanner;

public class Menu {
    private WorkerService workerService = new WorkerService();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("====== Worker Management ======");
            System.out.println("1. Add Worker");
            System.out.println("2. Increase Salary");
            System.out.println("3. Decrease Salary");
            System.out.println("4. Display Salary Information");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addWorker();
                    break;
                case 2:
                    adjustSalary(true);
                    break;
                case 3:
                    adjustSalary(false);
                    break;
                case 4:
                    workerService.displaySalaryInfo();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void addWorker() {
        System.out.println("---------Add worker---------");
        System.out.print("Enter Code: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Work Location: ");
        String workPlace = scanner.nextLine();

        workerService.addWorker(id, name, age, salary, workPlace);
    }

    private void adjustSalary(boolean increase) {
        System.out.println("--------Up/Down Salary---------");
        System.out.print("Enter Worker Code: ");
        String id = scanner.nextLine();
        System.out.print("Enter Salary Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        if (increase) {
            workerService.increaseSalary(id, amount);
        } else {
            workerService.decreaseSalary(id, amount);
        }
    }
}