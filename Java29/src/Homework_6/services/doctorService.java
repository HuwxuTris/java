package Homework_6.services;

import Homework_6.entities.Doctor;
import Homework_6.entities.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class doctorService {
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public void inputInfo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input Doctor's Info");
        System.out.println("Doctor's name : ");
        String name = scanner.nextLine();
        System.out.println("Age :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Speciality :");
        String speciality = scanner.nextLine();
        System.out.println("Worked Hours :");
        int hours = Integer.parseInt(scanner.nextLine());
        Doctor doctor = new Doctor(age, name, speciality, hours);
        doctors.add(doctor);
    }

    public void printInfo(Doctor doctor) {
        System.out.println("Doctor's name : " + doctor.getName());
        System.out.println("Age :" + doctor.getAge());
        System.out.println("Speciality :" + doctor.getSpeciality());
        System.out.println("Worked Hours :" + doctor.getWorkHours());
    }

    public void chooseDoctor() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available to display.");
            return;
        }
            System.out.println("Choose a doctor to display: ");
            for (int i = 0; i < doctors.size(); i++) {
                System.out.println((i + 1) + ". " + doctors.get(i).getName());
            }
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("Enter the number of the patient (1 to " + doctors.size() + "):");
                choice = Integer.parseInt(scanner.nextLine());
            } while (choice < 1 || choice > doctors.size());

            Doctor chosenDoctor = doctors.get(choice - 1);
            System.out.println("Info of patients number " + choice);
            printInfo(chosenDoctor);
        }
    }
