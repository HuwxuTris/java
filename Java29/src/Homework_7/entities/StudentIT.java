package Homework_7.entities;

public class StudentIT extends techMasterStudent {
    private double javaScore;
    private double htmlScore;
    private double cssScore;

    public StudentIT(String name, String speciality, double javaScore, double htmlScore, double cssScore) {
        super(name, speciality);
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javaScore = javaScore;
    }

    @Override
    public double getScore() {
        return (javaScore * 2 + htmlScore + cssScore) / 4;
    }
}
