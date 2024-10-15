package lesson_6;

public class Cat extends Animal{
    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void printInfo(){
        System.out.println("Name + " +getName()+ " - description : " + description + " - age :" + getAge());
    }
}
