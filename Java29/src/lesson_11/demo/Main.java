package lesson_11.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap Vao so nguyen : ");
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println(n);

            int arr[] = new int[n];
            for (int i = 0; i< n; i ++){
                System.out.println(arr[i]);
            }
        }
        catch (Exception e){
            System.out.println("Sai dinh dang, vui long thu lai");
        }

    }
}
