package Homework_6.entities;

public class Patient extends Person{
    private String medRecordNum;
    private String dateOfAdmission;

    public Patient(int age, String name,String medRecordNum, String dateOfAdmission) {
        super(age, name);
        this.medRecordNum = medRecordNum;
        this.dateOfAdmission = dateOfAdmission;
    }


    public String getMedRecordNum() {
        return medRecordNum;
    }

    public void setMedRecordNum(String medRecordNum) {
        this.medRecordNum = medRecordNum;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}
