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

    public void register(Scanner scanner) {
        System.out.println("Welcome to Register:");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Select Role: ");
        System.out.println("2 - Student");
        System.out.println("3 - Parent");
        System.out.print("Enter role number: ");
        int role = Integer.parseInt(scanner.nextLine());

        if (role == 2 || role == 3) {
            accountServices.registerUser(username, password, email, role);
        } else {
            System.out.println("Invalid role selection. Only Student and Parent roles can be registered.");
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
            boolean loggedIn = true;
            System.out.println("Logged in as " + accountServices.getRoleName(loggedInAccount.getRole()));
            userLoggedInMenu(scanner, loggedInAccount);
        }
    }

    private void userLoggedInMenu(Scanner scanner, Account account) {
        boolean loggedIn = true;
        while (loggedIn) {
            switch (account.getRole()) {
                case 0:
                    System.out.println("This is admin menu");
                    System.out.println("1. View Account by Role");
                    System.out.println("2. Create Teacher Account");
                    System.out.println("3. Delete an account with username");
                    System.out.println("0. Log out");

                    int option = Integer.parseInt(scanner.nextLine());
                    switch (option) {
                        case 1:
                            accountServices.viewAccountByRole();
                            break;
                        case 2:
                            createTeacherAccount(scanner);
                            break;
                        case 3:
                            System.out.println("Input the username of the account");
                            String username = scanner.nextLine();
                            accountServices.deleteAccount(username);
                            break;
                        case 0:
                            System.out.println("Logged out");
                            loggedIn = false;
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                    break;
                case 1:
                    System.out.println("This is teacher menu");
                    System.out.println("0. Log out");

                    int teacherOption = Integer.parseInt(scanner.nextLine());
                    if (teacherOption == 0) {
                        System.out.println("Logged out");
                        loggedIn = false;
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;
                case 2:
                    System.out.println("This is student menu");
                    System.out.println("0. Log out");

                    int studentOption = Integer.parseInt(scanner.nextLine());
                    if (studentOption == 0) {
                        System.out.println("Logged out");
                        loggedIn = false;
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;
                case 3:
                    System.out.println("This is parent menu");
                    System.out.println("0. Log out");

                    int parentOption = Integer.parseInt(scanner.nextLine());
                    if (parentOption == 0) {
                        System.out.println("Logged out");
                        loggedIn = false;
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;
                default:
                    System.out.println("Unknown role.");
                    loggedIn = false;
                    break;
            }
        }
    }


    public void createTeacherAccount(Scanner scanner) {
        System.out.println("Welcome to Register:");
        System.out.print("Enter teacher's username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        accountServices.registerUser(username, password, email, 1);
    }

}
