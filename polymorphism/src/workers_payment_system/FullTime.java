package workers_payment_system;

public class FullTime extends Worker {

    @Override
    public String calculateSalary() {
        this.salary = this.salary * 2;
        return "Full time worker salary: " + this.salary;
    }
    
}
