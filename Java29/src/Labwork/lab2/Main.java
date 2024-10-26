package Labwork.lab2;

import Labwork.lab2.Entities.Student;
import Labwork.lab2.Services.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students do you want to add?");
        int numStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Entering details for student " + (i + 1));
            studentService.inputInfo();
        }
        //get students list and print 
        for (Student student : studentService.getStudents()) {
            studentService.printInfo(student);
            System.out.println();
        }
    }
}
