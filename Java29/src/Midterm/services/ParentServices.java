package Midterm.services;

import Midterm.Database.Database;
import Midterm.entities.Parent;

import java.util.Scanner;

public class ParentServices {
    public void addParentDetails(String username, String email) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter child's email: ");
        String childEmail = scanner.nextLine();

        Parent parent = new Parent(username, name, email, childEmail);
        Database.getParents().put(username, parent); // Add parent to Database map
        System.out.println("Parent details saved.");
    }
}
