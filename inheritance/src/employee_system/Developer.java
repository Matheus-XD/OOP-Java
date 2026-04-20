package employee_system;

public class Developer extends Employee {
    @Override
    public double calculateBonus(){
        double bonus = this.getSalary() * 0.1;
        return bonus;
    }
}
