package lessson_3;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien can tinh : ");
        int elec = scanner.nextInt();
        if( elec > 0 && elec <= 50){
            int money = elec * 1000;
            System.out.println(" Gia dien thang nay la " +money + "vnd");
        }
        else if (elec > 50){
            int money = ((50 * 1000)) + ((elec - 50)*1200);
            System.out.println(" Gia dien thang nay la " +money + "vnd");
        }
        else {
            System.out.println("So dien khong hop le");
        }
    }}
