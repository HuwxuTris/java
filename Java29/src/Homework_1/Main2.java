package Homework_1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn : ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi của bạn : ");
        int age = Integer.parseInt(scanner.nextLine());
        if(age < 0 || age > 100){
            System.out.println("Cảnh báo: Tuổi không hợp lệ");
            System.out.println("Cảnh báo: Tuổi phải ở giữa 0 và 100");
            System.out.println("Cảnh báo: Hãy nhập tuổi thích hợp");
            age = Integer.parseInt(scanner.nextLine());
        }
        else {
        }
        System.out.println("Nhập tên môn học của bạn ");
        String subject = scanner.nextLine();

        System.out.println("Nhập email của bạn");
        String email = scanner.nextLine();
        if(!email.contains("@")){
            System.out.println("Cảnh báo: Email phải có @");
            System.out.println("Xin hãy nhập lại Email");
            email = scanner.nextLine();
        }
        else {

        }

        System.out.println("\nThông tin đã nhập:");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Môn học: " + subject);
        System.out.println("Email: " + email);

        scanner.close();
    }
}
