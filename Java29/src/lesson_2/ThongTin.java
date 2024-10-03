package lesson_2;

import java.util.Scanner;

public class ThongTin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên");
        String name = scanner.nextLine();

        System.out.println("Mời bạn nhập tuổi");
        int age = scanner.nextInt();
        // int age = Integer.parseInt(scanner.nextLine()); and can skip the following line 
        scanner.nextLine();

        System.out.println("Mời bạn nhập email");
        String email = scanner.nextLine();

        System.out.println("Mời bạn nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Email: " + email);
        System.out.println("Địa chỉ: " + address);
    }
}
