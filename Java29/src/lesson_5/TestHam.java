package lesson_5;

import java.util.Scanner;

public class TestHam {
    public static void main(String[] args) {
        printArray();
        System.out.println(multiplyN());


    }

    public static void printArray(){
        int array[] = {1,2,4,6};
        for (int ar : array){
            System.out.println(ar);
        }
        }
    public static int multiplyN (){
        System.out.println("Moi ban nhap so nguyen");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multi = 1;
        for (int i = 2; i <= n; i++){
            multi *= i;
        }
        return multi;
        }

}
