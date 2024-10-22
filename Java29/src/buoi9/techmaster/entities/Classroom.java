package buoi9.techmaster.entities;

import java.util.ArrayList;

public class Classroom {
    private String subject;
    private ArrayList<Student> students;

    public Classroom(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
