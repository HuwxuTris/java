package lesson_4;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        char choice;

        do {
            System.out.print("Enter an integer: ");
            number = scanner.nextInt();

            sum += number;

            System.out.print("Do you want to continue? (Y/N): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');


        System.out.println("The sum of all entered numbers is: " + sum);

        scanner.close();
    }
}