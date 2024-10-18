package Homework_7.services;

import Homework_7.entities.StudentBiz;

import java.util.Scanner;

public class StudentBizServices {

    public StudentBiz[] inputBizStudents(int numStudents) {
        Scanner scanner = new Scanner(System.in);
        StudentBiz[] students = new StudentBiz[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter name for Student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.println("Enter sale score: ");
            double saleScore = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter marketing score: ");
            double marketingScore = Double.parseDouble(scanner.nextLine());
            students[i] = new StudentBiz(name, "Biz", saleScore, marketingScore);
        }
        return students;
    }

    public void printBizStudentInfo(StudentBiz[] students) {
        for (StudentBiz student : students) {
            student.printInfo();
        }
    }
}
