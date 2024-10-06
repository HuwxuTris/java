package lessson_3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhap b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap phep tinh : ");
        String c = scanner.nextLine();

        switch (c){
            case "+":
                System.out.println(" a + b = "+ (a + b));
                break;
            case "-":
                System.out.println(" a - b = "+ (a - b));
                break;
            case "*":
                System.out.println(" a * b = "+ (a * b));
                break;
            case "/":
                System.out.println(" a / b = "+ (a / b));
                break;
            case "%":
                System.out.println(" a % b = "+ (a % b));
                break;
        }


    }
}
