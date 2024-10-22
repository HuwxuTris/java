package Midterm.services;

import Midterm.entities.Account;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountServices {
private ArrayList<Account> accounts = new ArrayList<>();

    //Register part
    public boolean isUsernameExists(String username) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
    public boolean isUsernameValid(String username){
        if (username.contains(" ")){
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
        return matcher.matches();
    }

    public boolean registerValid(String username, String password,String email){
        boolean isValid = true;
        if (isUsernameExists(username)) {
            System.out.println("Username existed.");
            isValid = false;
        }
        if (!isUsernameValid(username)){
            System.out.println("Username don't contain spaces.");
            isValid = false;
        }
        if (!isValidPassword(password))
        {
            System.out.println("Password is not valid." +
                    "Must have 1 UpCase Letter, 7 - 15 letters, and 1 symbol - _ , .");
            isValid = false;
        }
        if (isEmailExists(email)){
            System.out.println("Email existed.");
            isValid = false;
        }
        if (!isValidEmail(email)){
            System.out.println("Email is not valid.");
            isValid = false;
        }
        if (isValid) {
            accounts.add(new Account(username, password, email));
            System.out.println("Registered Successfully");
        }

        return isValid;
    }

    //Login Part

}
