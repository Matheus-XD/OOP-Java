package employee_system;

public class Manager extends Employee {
    @Override
    public double calculateBonus() {
        double bonus = this.getSalary() * 0.2;
        return bonus;
    }
}
