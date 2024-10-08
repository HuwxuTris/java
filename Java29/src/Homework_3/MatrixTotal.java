package Homework_3;

import java.util.Scanner;

public class MatrixTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Nhap so dong :");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot:");
        int columns = Integer.parseInt(scanner.nextLine());


        int[][] array = new int[rows][columns];

        System.out.println("Nhap gia tri cho ma tran 2D:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int sum = 0;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] % 3 == 0) {
                    sum += array[i][j];
                }
            }
        }

        System.out.println("Tong tat ca cac so chia het cho 3 trong ma tran: " + sum);

        scanner.close();
    }
}
