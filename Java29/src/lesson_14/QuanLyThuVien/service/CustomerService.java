package lesson_14.QuanLyThuVien.service;

import lesson_14.QuanLyThuVien.entities.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    Scanner scanner = new Scanner(System.in);
    public void addCustomer(){
        List<Customer> customers = new ArrayList<>();
        System.out.println("Customer Name: ");
        String name = scanner.nextLine();
        System.out.println("Customer Phone: ");
        String phoneNumber = scanner.nextLine();
        Customer customer = new Customer(name,phoneNumber);
    }
}
