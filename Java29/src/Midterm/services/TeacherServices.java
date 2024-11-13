package Midterm.services;

import Midterm.Database.Database;
import Midterm.entities.Speciality;
import Midterm.entities.Student;
import Midterm.entities.Teacher;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TeacherServices {
    StudentServices studentServices = new StudentServices();
    public void addTeacherDetails(String username, String email) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter origin: ");
        String origin = scanner.nextLine();
        System.out.print("Enter speciality: ");
        Speciality speciality = null;
        while (speciality == null) {
            System.out.println("Enter speciality (Choose from): ");
            for (Speciality s : Speciality.values()) {
                System.out.println("- " + s);
            }
            String specialityInput = scanner.nextLine().toUpperCase();

            try {
                speciality = Speciality.valueOf(specialityInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid speciality. Please enter a valid option.");
            }
        }
        LocalDate dob = null;

        while (dob == null) {
            System.out.print("Please enter your date of birth (YYYY-MM-DD): ");
            String dobInput = scanner.nextLine();

            try {
                dob = LocalDate.parse(dobInput, DateTimeFormatter.ISO_LOCAL_DATE);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please enter the date in the format YYYY-MM-DD.");
            }
        }

        Teacher teacher = new Teacher(username, name, origin, email, speciality,dob);
        Database.getTeachers().put(username, teacher);
        System.out.println("Student details saved.");
    }
    public void getListOnSpeciality(Scanner scanner){
        System.out.println("List student of :");
        Speciality speciality = null;
        while (speciality == null) {
            System.out.println("Enter speciality (Choose from): ");
            for (Speciality s : Speciality.values()) {
                System.out.println("- " + s);
            }
            String specialityInput = scanner.nextLine().toUpperCase();

            try {
                speciality = Speciality.valueOf(specialityInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid speciality. Please enter a valid option.");
            }
        }
        System.out.println("List student of " + speciality);
        for (Student student : Database.students.values()){
            if (student.getSpeciality().equals(speciality)){
                studentServices.printInfo(student);
            }
        }
    }
    public void createNotification(Scanner scanner){

    }
}
