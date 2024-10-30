package Lab_4.entities;

public class AdministrativeEmployee extends Employee {

    public AdministrativeEmployee(String name, double monthlySalary) {
        super( name, monthlySalary);
    }

    @Override
    public double calculateIncome() {
        return monthlySalary;
    }
}
