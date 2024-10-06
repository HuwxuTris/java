package lessson_3;

import java.util.Scanner;

public class Equation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao a");
        int a = scanner.nextInt();

        System.out.println("Nhap vao b");
        int b = scanner.nextInt();

        System.out.println("Nhap vao c");
        int c = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                int x = -c / b;
                System.out.println("Phuong trinh bac nhat: x = " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem la x1 = " + x1 + ", va x2 = " + x2);
            }
        }
    }
}
