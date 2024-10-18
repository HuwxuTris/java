
package Homework_7.services;

import Homework_7.entities.StudentIT;

import java.util.Scanner;

public class StudentITServices {

    public StudentIT[] inputITStudents(int numStudents) {
        Scanner scanner = new Scanner(System.in);
        StudentIT[] students = new StudentIT[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter name for Student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.println("Enter Java score: ");
            double javaScore = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter HTML score: ");
            double htmlScore = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter CSS score: ");
            double cssScore = Double.parseDouble(scanner.nextLine());
            students[i] = new StudentIT(name, "IT", javaScore, htmlScore, cssScore);
        }
        return students;
    }

    public void printITStudentInfo(StudentIT[] students) {
        for (StudentIT student : students) {
            student.printInfo();
        }
    }
}
