package lesson_14.QuanLyThuVien.entities;

public class Book {
    private int id;
    private static int autoId;
    private String name;
    private int quantity;
    private String status;

    public Book(int id, String name, int quantity, String status) {
        this.id = ++autoId;
        this.name = name;
        this.quantity = quantity;
        this.status = status;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
