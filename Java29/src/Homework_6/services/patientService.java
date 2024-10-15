package Homework_6.services;

import Homework_6.entities.Patient;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class patientService {
    private ArrayList<Patient> patients = new ArrayList<>();
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Patient Info");
        System.out.println("Patient's name : ");
        String name = scanner.nextLine();
        System.out.println("Age :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Medical Record Number");
        String medNumber = scanner.nextLine();
        System.out.println("Date of admission");
        String dateAdmission = scanner.nextLine();
        Patient patient = new Patient(age,name,medNumber,dateAdmission);
        patients.add(patient);
    }
    public void printInfo(Patient patient){
        System.out.println("Name : " + patient.getName());
        System.out.println("Age : " + patient.getAge());
        System.out.println("Medical Record Number : "+ patient.getMedRecordNum());
        System.out.println("Date of admission: " + patient.getDateOfAdmission());
    }
    public void choosePatient(){
        if (patients.isEmpty()) {
            System.out.println("No patients available to display.");
            return;
        }
        System.out.println("Choose a patient to display: ");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println((i + 1) + ". " + patients.get(i).getName());
        }
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter the number of the patient (1 to " + patients.size() + "):");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice < 1 || choice > patients.size());

        Patient chosenPatient = patients.get(choice - 1);
        System.out.println("Info of patients number " + choice);
        printInfo(chosenPatient);

    }
}
