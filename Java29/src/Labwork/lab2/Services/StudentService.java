package Labwork.lab2.Services;

import Labwork.lab2.Entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input student name : ");
        String name = scanner.nextLine();
        System.out.println("Input student Math Score :");
        int mathScore = Integer.parseInt(scanner.nextLine());
        System.out.println("Input student Physic Score :");
        int physicScore = Integer.parseInt(scanner.nextLine());
        System.out.println("Input student Chemistry Score : ");
        int chemistryScore = Integer.parseInt(scanner.nextLine());

        students.add(new Student(name, mathScore, physicScore, chemistryScore));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public double getAverageScore(Student student) {
        return (double) (student.getScoreChemistry() + student.getScoreMath() + student.getScorePhysic()) / 3;
    }
    public String getClassify(Student student) {
        double avgScore = getAverageScore(student);
        if (avgScore >= 8) {
            return "A";
        } else if (avgScore >= 6.5) {
            return "B";
        } else {
            return "C";
        }
    }
    public void printInfo(Student student) {
        System.out.println("Student Info :");
        System.out.println(" ID : " + student.getId());
        System.out.println(" Name : " + student.getName());
        System.out.println(" Average Score : " + getAverageScore(student));
        System.out.println(" Classify : " + getClassify(student));
    }
}
