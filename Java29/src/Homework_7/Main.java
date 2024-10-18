package Homework_7;

import Homework_7.entities.StudentBiz;
import Homework_7.entities.StudentIT;
import Homework_7.services.StudentBizServices;
import Homework_7.services.StudentITServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentITServices studentITServices = new StudentITServices();
        StudentBizServices studentBizServices = new StudentBizServices();

        //Tao array de luu tru danh sach sinh vien
        StudentIT[] itStudents = null;
        StudentBiz[] bizStudents = null;
        int options;
        do {
            System.out.println("Please choose an option:");
            System.out.println("1. Input IT students");
            System.out.println("2. Input Biz students");
            System.out.println("3. Print IT students");
            System.out.println("4. Print Biz students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            options = Integer.parseInt(scanner.nextLine());
            switch (options){
                case 1:
                    System.out.println("Input the numbers of IT students :");
                    int numIT = Integer.parseInt(scanner.nextLine());
                    itStudents = studentITServices.inputITStudents(numIT);
                    break;
                case 2:
                    System.out.println("Input the numbers of Biz students :");
                    int numBiz = Integer.parseInt(scanner.nextLine());
                    bizStudents = studentBizServices.inputBizStudents(numBiz);
                    break;
                case 3:
                    if (itStudents != null){
                        studentITServices.printITStudentInfo(itStudents);
                    }
                    else{
                        System.out.println("IT student list is empty");
                    }
                    break;
                case 4:
                    if (bizStudents != null){
                        studentBizServices.printBizStudentInfo(bizStudents);;
                    }
                    else{
                        System.out.println("Biz student list is empty");
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
            }
        }
        while (options!=5);

    }
}
