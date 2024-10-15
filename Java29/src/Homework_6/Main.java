package Homework_6;

import java.util.Scanner;

import Homework_6.services.doctorService;
import Homework_6.services.patientService;

public class Main {
    public static void main(String[] args) {
        patientService patientService = new patientService();
        doctorService doctorService = new doctorService();
        int options;

        System.out.println("Welcome to Hospital Manage:");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Input Patient");
            System.out.println("2. Input Doctor");
            System.out.println("3. Display Patient");
            System.out.println("4. Display Doctor");
            System.out.println("5. Exit");
            options = Integer.parseInt(scanner.nextLine());
            switch (options) {
                case 1:
                    patientService.inputInfo();
                    break;
                case 2:
                    doctorService.inputInfo();
                    break;
                case 3:
                    patientService.choosePatient();
                    break;
                case 4:
                    doctorService.chooseDoctor();
                    break;
                case 5:
                    System.out.println("GoodBye to ur data :) :");
                    break;
            }
        }
        while (options!= 5);
    }
}
