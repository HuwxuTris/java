package Homework_2;

import java.util.Scanner;

public class SumandMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap n : ");
        int n = scanner.nextInt();
        int total = 0;
        for (int i = 0; i <= n; i++){
            total = total + i;
        }
        int mul = 1;
        System.out.println(total);
        for (int i = 1; i <= n; i++){
            mul = mul * i;
        }
        System.out.println(mul);
    }
}
