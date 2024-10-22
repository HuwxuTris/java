package buoi9.techmaster;

import buoi9.techmaster.entities.Techmaster;
import buoi9.techmaster.service.TechmasterService;
import buoi9.techmaster.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo ra trung tâm -> Nhập dữ liệu đầu vào
        TechmasterService techmasterService = new TechmasterService();
        Scanner scanner = new Scanner(System.in);
        Techmaster techmaster = techmasterService.inputInfo(scanner);
        Menu menu = new Menu();
        while (true){
            menu.displayMenu(scanner, techmaster);
        }

    }
}
