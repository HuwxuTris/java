package Homework_3;

import lessson_3.Interger;

import java.util.Objects;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardNumber = "12345678";
        int pin = 1234;
        double balance = 500.00;
        String transactionHistory = "";

        System.out.println("ATM welcome ");
        System.out.println("Enter Card number: : (* 8 number)");
        String inputCardNumber = scanner.nextLine();
        System.out.println("Enter PIN: : (* 4 number)");
        int inputPin = Integer.parseInt(scanner.nextLine());
        if (inputCardNumber.equals(cardNumber) && inputPin == pin){
            int option;
            do {
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. View Transaction History");
                System.out.println("5. Exit");
                System.out.print("Select option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Current Balance : " + balance);
                        break;
                    case 2:
                        if (balance == 0) {
                            System.out.println("Your balance is not enough to do any transaction");
                        } else {
//                            Chong nuot lenh
                            scanner.nextLine();
                            System.out.println("Enter destined card number :");
                            String destinedCard = scanner.nextLine();
                            System.out.println("Enter deposit amount : ");
                            double depositAmount = scanner.nextDouble();
                            if (depositAmount > balance) {
                                System.out.println("Your current balance is not enough for this transaction");
                            } else {
                                balance = balance - depositAmount;
                                transactionHistory += " Transferred: " + depositAmount + " to card " + destinedCard + "" +
                                        "\n";
                            }
                        }
                        break;
                    case 3:
                        if (balance == 0) {
                            System.out.println("Your balance is not enough to do any transaction");
                        } else {
                            scanner.nextLine();
                            System.out.println("Enter withdraw amount : ");
                            double withdrawAmount = scanner.nextDouble();
                            if (withdrawAmount > balance) {
                                System.out.println("Your current balance is not enough for this transaction");
                            } else {
                                balance = balance - withdrawAmount;
                                transactionHistory += " Withdrew: " + withdrawAmount;
                            }
                        }
                        break;
                    case 4:
                        if (transactionHistory.isEmpty()) {
                            System.out.println("No transaction made");
                        } else {
                            System.out.println("Transaction history");
                            System.out.println(transactionHistory);
                        }
                        break;
                    case 5:
                        System.out.println("Thanks for using the ATM");
                        break;
                    default:
                        System.out.println("Invalid option. Try again");
                }
            }
            while (option != 5);
        }
        else {
            System.out.println("Invalid Card Number or Pin");
        }
    }
}
