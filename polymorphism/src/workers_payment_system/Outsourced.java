package workers_payment_system;

public class Outsourced extends Worker{

    @Override
    public String calculateSalary(){
        this.salary = this.salary - 200;
        return "Outsourced worker salary: " + this.salary;
    }
    
}
