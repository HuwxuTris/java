package Midterm.entities;

public class Parent {
    private String username;
    private String name;
    private String email;
    private String childEmail;

    public Parent(String username, String name, String email, String childEmail) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.childEmail = childEmail;
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


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChildEmail() {
        return childEmail;
    }

    public void setChildEmail(String childEmail) {
        this.childEmail = childEmail;
    }
}