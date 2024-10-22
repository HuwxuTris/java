package lesson_8.Entities;

import java.util.List;

public class Class {
    private String subject;
    private List<String> studentlist;

    public Class(String subject, List<String> studentlist) {
        this.subject = subject;
        this.studentlist = studentlist;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(List<String> studentlist) {
        this.studentlist = studentlist;
    }
}
