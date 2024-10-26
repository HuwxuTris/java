package Midterm.services;

import Midterm.entities.Account;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountServices {
    private ArrayList<Account> accounts = new ArrayList<>();


    public boolean isUsernameExists(String username) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean isUsernameValid(String username) {
        if (username.contains(" ")) {
            return false;
        }
        return true;
    }

    public boolean isEmailExists(String email) {
        for (Account account : accounts) {
            if (account.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[.,-_])[A-Za-z0-9.,-_]{7,15}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return !matcher.matches();
    }

    public void registerValid(String userName, String passWord, String email) {
        boolean isValid = true;
        if (isUsernameExists(userName)) {
            System.out.println("Username already exists.");
            isValid = false;
        }
        if (!isUsernameValid(userName)) {
            System.out.println("Username cannot contain spaces.");
            isValid = false;
        }
        if (isValidPassword(passWord)) {
            System.out.println("Invalid password format. Must have 1 uppercase letter, 7-15 characters, and 1 symbol (-, _, .).");
            isValid = false;
        }
        if (isEmailExists(email)) {
            System.out.println("Email already exists.");
            isValid = false;
        }
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format.");
            isValid = false;
        }
        if (isValid) {
            accounts.add(new Account(userName, passWord, email));
            System.out.println("Registered Successfully.");
        }
    }

    // Login Part
    public boolean loginValid(String userName, String password) {
        Account foundUserAccount = findAccountByUserName(userName);
        if (!isUsernameValid(userName)) {
            System.out.println("Username cannot contain spaces.");
            return false;
        }
        if (foundUserAccount == null) {
            System.out.println("Username not found. Please try again.");
            return false;
        }
        if (!foundUserAccount.getPassword().equals(password)) {
            System.out.println("Password is incorrect.");
            handlePasswordOptions(foundUserAccount);
            return false;
        }
        System.out.println("Login Successful.");
        return true;
    }

    // Handle password options
    private void handlePasswordOptions(Account account) {
        Scanner scanner = new Scanner(System.in);
        boolean validOption = false;

        while (!validOption) {
            System.out.println("1. Try logging in again");
            System.out.println("2. Forgot password");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Please enter your username and password again.");
                    validOption = true;
                    break;
                case 2:
                    passwordRecoverWithEmail(account);
                    validOption = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Password recovery method
    public void passwordRecoverWithEmail(Account account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the email used for registration: ");
        String email = scanner.nextLine();
        if (account.getEmail().equals(email)) {
            System.out.print("Email verified. Please enter a new password: ");
            String newPassword = scanner.nextLine();
            while (isValidPassword(newPassword)) {
                System.out.println("Invalid password format. Password must have one uppercase letter, 7-15 characters, and one symbol (-, _, .).");
                newPassword = scanner.nextLine();
            }
            account.setPassword(newPassword);
            System.out.println("Password has been reset successfully!");
        } else {
            System.out.println("Email does not match. Password reset failed.");
        }
    }

    public Account findAccountByUserName(String userName) {
        for (Account account : accounts) {
            if (account.getUsername().equals(userName)) {
                return account;
            }
        }
        return null;
    }

    //Logged in user logic
    public void changeUsername(Account account, String newUsername) {
        if (!isUsernameExists(newUsername) && isUsernameValid(newUsername)) {
            account.setUsername(newUsername);
            System.out.println("Username updated successfully.");
        } else {
            System.out.println("Invalid or already existing username.");
        }
    }

    public void changeEmail(Account account, String newEmail) {
        if (!isEmailExists(newEmail) && isValidEmail(newEmail)) {
            account.setEmail(newEmail);
            System.out.println("Email updated successfully.");
        } else {
            System.out.println("Invalid or already existing email.");
        }
    }

    public void changePassword(Account account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();
        while (isValidPassword(newPassword)) {
            System.out.println("Invalid password format. Must have 1 uppercase letter, 7-15 characters, and 1 symbol (-, _, .).");
            newPassword = scanner.nextLine();
        }
        account.setPassword(newPassword);
        System.out.println("Password updated successfully.");
    }
}
