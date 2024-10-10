package Homework_4;


import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("techmaster", "hoclacoviec", 1000000);

        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.println("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(account.getUsername()) && inputPassword.equals(account.getPassword())) {
                loggedIn = true;
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed. Do you want to try again? (Y/N)");
                String retry = scanner.nextLine();
                if (retry.equalsIgnoreCase("N")) {
                    System.out.println("Exiting program.");
                    System.exit(0);
                }
            }
        }

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. View account information");
            System.out.println("2. Withdraw money");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    account.displayAccountInfo();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    account.withdraw(amount);
                    break;
                default:
                    System.out.println("Invalid option.");
            }

            System.out.println("Do you want to continue? (Y/N)");
            String continueOption = scanner.nextLine();
            if (continueOption.equalsIgnoreCase("N")) {
                running = false;
                System.out.println("Exiting program.");
            }
        }

        scanner.close();
    }
}