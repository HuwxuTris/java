package lesson_8.Entities;

public class Student {
    private static int autoid;
    private int id;
    private String age;
    private String classify;

    public Student(int id, String age, String classify) {
        this.id = ++autoid;
        this.age = age;
        this.classify = classify;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }
}
