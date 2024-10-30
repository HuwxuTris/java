package Lab_4.entities;

public class Manager extends Employee {
    private double responsibilityAllowance;

    public Manager(String name, double monthlySalary, double responsibilityAllowance) {
        super(name, monthlySalary);
        this.responsibilityAllowance = responsibilityAllowance;
    }

    @Override
    public double calculateIncome() {
        return monthlySalary + responsibilityAllowance;
    }
}
