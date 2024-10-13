package Homework_5;

class Animal {
    private int id;
    private String name;
    private String description;
    private boolean gender;

    public Animal(int id, String name, String description, boolean gender) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.gender = gender;
    }

    public void printInfo() {
        String genderStr = gender ? "Male" : "Female";
        System.out.println("ID: " + id + ", Name: " + name + ", Description: " + description + ", Gender: " + genderStr);
    }
}
