package buoi9.techmaster.service;

import buoi9.techmaster.entities.Classroom;
import buoi9.techmaster.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomService {
    StudentService studentService = new StudentService();
    public Classroom inputInfo(Scanner scanner){
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Mời b nhập thông tin của môn học: ");
        String subject = scanner.nextLine();
        System.out.println("Mời b nhập thông tin của học viên: ");
        while (true){
            Student student = studentService.inputInfo(scanner);
            students.add(student);
            System.out.println("Bạn có muốn tạo tiếp học sinh không? ");
            String choose = scanner.nextLine();
            if(choose.equalsIgnoreCase("N"))
                break;
        }
        Classroom classroom = new Classroom(subject, students);
        return classroom;
    }
}
