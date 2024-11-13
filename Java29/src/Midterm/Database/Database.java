package Midterm.Database;

import Midterm.entities.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Database {
    public static Map<String, Account> accounts = new HashMap<>();
    public static Map<String, Student> students = new HashMap<>();
    public static Map<String, Parent> parents = new HashMap<>();
    public static Map<String, Teacher> teachers = new HashMap<>();


    static {
        // Add default accounts
        accounts.put("adminUser", new Account("adminUser", "Admin123!", "admin@example.com", 0)); // Admin
        accounts.put("teacherUser1", new Account("teacherUser1", "Teach456!", "teacher1@example.com", 1)); // Teacher
        accounts.put("teacherUser2", new Account("teacherUser2", "Teach789!", "teacher2@example.com", 1)); // Teacher
        accounts.put("studentUser1", new Account("studentUser1", "Stud101!", "student1@example.com", 2)); // Student
        accounts.put("studentUser2", new Account("studentUser2", "Stud202!", "student2@example.com", 2)); // Student
        accounts.put("parentUser1", new Account("parentUser1", "Par_303!", "parent1@example.com", 3)); // Parent
        accounts.put("parentUser2", new Account("parentUser2", "Par_404!", "parent2@example.com", 3)); // Parent

        teachers.put("teacherUser1", new Teacher("teacherUser1","Teacher1 ", "USA", "teacher1@example.com", Speciality.WEB, LocalDate.of(1999,12,1)));
        teachers.put("teacherUser2", new Teacher("teacherUser2","Teacher2 ", "French", "teacher2@example.com",Speciality.WEB,LocalDate.of(1999,12,1)));
        // Add details for students
        students.put("studentUser1", new Student("studentUser1", "Alice Smith", "USA", "student1@example.com", Speciality.WEB, LocalDate.of(2006,12,1)));
        students.put("studentUser2", new Student("studentUser2", "Bob Johnson", "Canada", "student2@example.com", Speciality.WEB, LocalDate.of(2008,12,1)));

        // Add details for parents
        parents.put("parentUser1", new Parent("parentUser1", "Carol Smith", "parent1@example.com", "student1@example.com"));
        parents.put("parentUser2", new Parent("parentUser2", "David Johnson", "parent2@example.com", "student2@example.com"));
    }

    public static Map<String, Account> getAccounts() {
        return accounts;
    }

    public static Map<String, Student> getStudents() {
        return students;
    }

    public static Map<String, Parent> getParents() {
        return parents;
    }

    public static Map<String, Teacher> getTeachers(){
        return teachers;
    }
}
