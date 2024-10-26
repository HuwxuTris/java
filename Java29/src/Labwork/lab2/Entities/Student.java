package Labwork.lab2.Entities;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private int scoreMath;
    private int scorePhysic;
    private int scoreChemistry;

    public Student(String name, int scoreMath, int scorePhysic, int scoreChemistry) {
        this.id = ++autoId;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(int scoreMath) {
        this.scoreMath = scoreMath;
    }

    public int getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(int scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public int getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(int scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }
}
