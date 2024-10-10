package lesson_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Enter person age :");
        person.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter person name :");
        person.setName(sc.nextLine());
        System.out.println("Enter person address :");
        person.setAddress(sc.nextLine());
        System.out.println(person.toString());


    }
}
