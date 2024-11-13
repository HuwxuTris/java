package lesson_14.QuanLyThuVien.entities;

public class Customer {
    private static int autoId;
    private int id;
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.id = ++autoId;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
