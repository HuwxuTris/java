package Midterm.View;

import Midterm.entities.Account;
import Midterm.services.AccountServices;

import java.util.List;
import java.util.Scanner;

public class Menu {
    AccountServices accountServices = new AccountServices();
    public void displayMenu(Scanner scanner) {
        while (true) {
            System.out.println("1 - Đăng nhập");
            System.out.println("2 - Đăng ký");
            System.out.println("0 - Thoát chương trình");
            System.out.print("Mời bạn lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    //todo Login
                    break;
                case 2:
                    register(scanner);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    public void register(Scanner scanner) {
        System.out.println("Welcome to Register : ");
        System.out.println("Input your username : ");
        String username = scanner.nextLine();
        System.out.println("Your password : ");
        String password = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        accountServices.registerValid(username,password,email);
    }
}
