package Midterm.View;

import Midterm.entities.Account;
import Midterm.services.AccountServices;

import java.util.Scanner;

public class Menu {
    AccountServices accountServices = new AccountServices();

    public void displayMenu(Scanner scanner) {
        while (true) {
            System.out.println("1 - Login");
            System.out.println("2 - Register");
            System.out.println("0 - Exit Program");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    register(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public void login(Scanner scanner) {
        System.out.println("Welcome to Login:");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Account loggedInAccount = accountServices.findAccountByUserName(username);
        if (accountServices.loginValid(username, password)) {
            userLoggedInMenu(scanner, loggedInAccount);
        }
    }
    private void userLoggedInMenu(Scanner scanner, Account account) {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("\n1. Change Username");
            System.out.println("2. Change Email");
            System.out.println("3. Change Password");
            System.out.println("4. Log Out");
            System.out.println("5. Exit Program");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter new username: ");
                    String newUsername = scanner.nextLine();
                    accountServices.changeUsername(account, newUsername);
                    break;
                case 2:
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    accountServices.changeEmail(account, newEmail);
                    break;
                case 3:
                    accountServices.changePassword(account);
                    break;
                case 4:
                    System.out.println("Logging out...");
                    loggedIn = false;
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public void register(Scanner scanner) {
        System.out.println("Welcome to Register:");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        accountServices.registerValid(username, password, email);
    }
}
