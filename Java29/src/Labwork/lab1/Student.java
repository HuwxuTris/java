package Labwork.lab1;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private String address;

    public Student(String name, String address) {
        this.id = ++autoId;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {

        return " \nid " + id + " \n name : " + name + " \n address : " +address;
    }
}