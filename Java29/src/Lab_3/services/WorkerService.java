package Lab_3.services;

import Lab_3.entities.Worker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class WorkerService {
    private List<Worker> workers = new ArrayList<>();
    private List<String> salaryHistory = new ArrayList<>();

    public void addWorker(String id, String name, int age, double salary, String workPlace) {
        Worker worker = new Worker(id, name, age, salary, workPlace);
        workers.add(worker);
        System.out.println("Worker added successfully.");
    }

    public void increaseSalary(String id, double amount) {
        adjustSalary(id, amount, "UP");
    }

    public void decreaseSalary(String id, double amount) {
        adjustSalary(id, amount, "DOWN");
    }

    private void adjustSalary(String id, double amount, String status) {
        for (Worker worker : workers) {
            if (worker.getId().equals(id)) {
                double newSalary = status.equals("UP") ? worker.getSalary() + amount : worker.getSalary() - amount;
                worker.setSalary(newSalary);
                String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                salaryHistory.add(String.format("%s %-10s %-10d %-10.2f %-10s %-10s", worker.getId(), worker.getName(), worker.getAge(), newSalary, status, date));
                System.out.println("Salary updated successfully.");
                return;
            }
        }
        System.out.println("Worker not found.");
    }

    public void displaySalaryInfo() {
        System.out.println("--------------Display Information Salary----------------");
        System.out.println("Code      Name      Age       Salary    Status    Date");
        for (String record : salaryHistory) {
            System.out.println(record);
        }
    }
}