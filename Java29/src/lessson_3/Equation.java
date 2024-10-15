package lessson_3;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao a");
        int a = scanner.nextInt();

        System.out.println("Nhap vao b");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            double x = (double) -b / a;
            System.out.println("Phuong trinh co nghiem la: " + x);
        }
    }
}
