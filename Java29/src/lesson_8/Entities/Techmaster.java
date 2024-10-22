package lesson_8.Entities;

public class Techmaster {
    private String manager;
    private String teacher;
    private String className;

    public Techmaster(String manager, String teacher, String className) {
        this.manager = manager;
        this.teacher = teacher;
        this.className = className;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
