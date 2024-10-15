package Homework_6.entities;

public class Doctor extends Person{
    private String speciality;
    private int workHours;
    public Doctor(int age, String name,String speciality, int workHours) {
        super(age, name);
        this.speciality = speciality;
        this.workHours = workHours;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
