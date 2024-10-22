package buoi9.techmaster.service;

import buoi9.techmaster.entities.Student;
import buoi9.techmaster.entities.Techmaster;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập xếp loại: ");
        String classify = scanner.nextLine();
        Student duc = new Student(name, classify);
        return duc;
    }

    public void updateClassify(Scanner scanner, Techmaster techmaster){
        System.out.println("mời b nhập id của học viên muốn chỉnh sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checkExisted = false;
        for (Student st: techmaster.getClassroom().getStudents()){
            if(st.getId() == id){
                checkExisted = true;
                System.out.println("Mời b nhập loại: ");
                String classify = scanner.nextLine();
                st.setClassify(classify);
                break;
            }
        }
        if(!checkExisted)
            System.out.println("K có học viên có id ="+id);
    }
    public void deleteStudent(Scanner scanner, Techmaster techmaster){
        System.out.println("Mời bạn nhập id của học viên muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        List<Student> students = techmaster.getClassroom().getStudents();
        boolean checkExisted = false;
        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                checkExisted = true;
                System.out.println("Học viên với ID = " + id + " đã được xóa.");
                break;
            }
        }
    }

}
