package lesson_7.entities;

public class StudentBiz extends techMasterStudent{
    private double marketingScore;
    private double saleScore;

    public StudentBiz(String name, String speciality, double saleScore, double marketingScore) {
        super(name, speciality);
        this.saleScore = saleScore;
        this.marketingScore = marketingScore;
    }

    @Override
    public double getScore() {
        return (2*marketingScore + saleScore)/3;
    }

}
