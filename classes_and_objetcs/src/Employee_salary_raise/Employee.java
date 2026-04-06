package Employee_salary_raise;


public class Employee {
    public String name;
    public double grossSalary;
    public double tax; 

    public double netSalary(){
        return grossSalary - tax;
    }
    public void status(){
        System.out.printf("%s, $%.2f\n", name, netSalary());
    }

    public void increaseSalary(double percentage){
        grossSalary = grossSalary + (grossSalary * percentage / 100);
    }
}

