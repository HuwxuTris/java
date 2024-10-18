package lesson_7.entities;

public abstract class techMasterStudent {
    private String name;
    private String speciality;


    public techMasterStudent(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
    }

    public abstract double getScore();

    public String classify() {
        double i = getScore();
        if (i < 5) {
            return "weak";
        } else if (i < 6.5) {
            return "Medium";
        } else if (i < 7.5) {
            return "Good";
        } else {
            return "Excellent";
        }
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(speciality);
        System.out.println(getScore());
        System.out.println(classify());
    }
}
