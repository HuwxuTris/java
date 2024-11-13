package Midterm.services;

import java.util.Scanner;

public class AdminServices {
    public void createTeacherAccount(Scanner scanner) {
        AccountServices accountServices = new AccountServices();
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
