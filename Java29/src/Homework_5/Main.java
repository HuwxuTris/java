package Homework_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main manager = new Main();

        System.out.print("Bạn muốn nhập vào bao nhiêu loài vật? ");
        int numAnimals = scanner.nextInt();

        for (int i = 0; i < numAnimals; i++) {
            System.out.println("\nNhập thông tin cho loài vật " + (i + 1) + ":");
            manager.addAnimal();
        }

        manager.printAnimals();
    }

    private ArrayList<Animal> animals;

    public Main() {
        animals = new ArrayList<>();
    }

    public void addAnimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tên: ");
        String name = scanner.nextLine();

        System.out.print("Mô tả: ");
        String description = scanner.nextLine();

        System.out.print("Giới tính (1 là đực, 0 là cái): ");
        int genderInput = scanner.nextInt();
        boolean gender = genderInput == 1;

        Animal animal = new Animal(id, name, description, gender);
        animals.add(animal);
    }

    public void printAnimals() {
        System.out.println("\nDanh sách các loài vật đã nhập:");
        for (Animal animal : animals) {
            animal.printInfo();
        }
    }


}