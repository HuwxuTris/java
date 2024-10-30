package Lab_4.entities;

public class SalesEmployee extends Employee {
    private double salesAmount;
    private double commissionRate;

    public SalesEmployee(String name, double monthlySalary, double salesAmount, double commissionRate) {
        super(name, monthlySalary);
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateIncome() {
        return monthlySalary + (salesAmount * commissionRate);
    }
}
