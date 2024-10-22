package buoi9.techmaster.service;

import buoi9.techmaster.entities.Classroom;
import buoi9.techmaster.entities.Techmaster;

import java.util.Scanner;

public class TechmasterService {
    ClassroomService classroomService = new ClassroomService();
    public Techmaster inputInfo(Scanner scanner){
        System.out.println("Mời b nhập thông tin của quản lý lớp: ");
        String manager = scanner.nextLine();
        System.out.println("Mời b nhập thông tin GV: ");
        String teacher = scanner.nextLine();
        System.out.println("Mời b nhập thông tin lớp học: ");
        Classroom classroom = classroomService.inputInfo(scanner);
        return new Techmaster(manager, teacher, classroom);
    }
}
