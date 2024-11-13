package Midterm.entities;

import java.time.LocalDate;

public class Student {
    private static int autoId = 0;
    private int id;
    private String username;
    private String name;
    private String origin;
    private String email;
    private Speciality speciality;
    private LocalDate dob;

    public Student(String username, String name, String origin, String email, Speciality speciality, LocalDate dob) {
        this.id = ++autoId;
        this.username = username;
        this.name = name;
        this.origin = origin;
        this.email = email;
        this.speciality = speciality;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}