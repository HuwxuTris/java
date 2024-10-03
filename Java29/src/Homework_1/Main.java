package Homework_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn : ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi của bạn : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println((age <= 0 || age > 100) ? "CẢNH BÁO: Tuổi không hợp lệ!" : "");
        System.out.println("Nhập tên môn học của bạn ");
        String subject = scanner.nextLine();

        System.out.println("Nhập email của bạn");
        String email = scanner.nextLine();
        System.out.println(!email.contains("@") ? "CẢNH BÁO: Email không hợp lệ!" : "");


        System.out.println("\nThông tin đã nhập:");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Môn học: " + subject);
        System.out.println("Email: " + email);

        scanner.close();
    }
}
