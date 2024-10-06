package Homework_2;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap n : ");
        int n = scanner.nextInt();
        int total = 0;
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    total = total + i;
                }
            }
            System.out.println("Tong cac so nguyen tu 1 den n la : " + total);
        }
        else {
            for (int i = 0; i >= n; i--) {
                if (i % 2 == 0) {
                    total = total + i;
                }
            }
            System.out.println("Tong cac so nguyen tu 1 den n la : " + total);
        }
    }
}
