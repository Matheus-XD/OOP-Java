package workers_payment_system;

public class PartTime extends Worker{

    @Override
    public String calculateSalary() {
        return "Part time Worker salary: " + this.salary;
    }
    
}
