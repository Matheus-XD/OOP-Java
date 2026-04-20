package employee_salary_raise;


public class Employee {
    private String name;
    private double grossSalary;
    private double tax;
    
    public void setName(String name){
        this.name = name;
    }
    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }
    public void setTax(double tax){
        this.tax = tax;
    }
    

    public String getName() {
        return name;
    }
    public double getGrossSalary() {
        return grossSalary;
    }
    public double getTax() {
        return tax;
    }

    public double netSalary(){
        return grossSalary - tax;
    }
    public void status(){
        System.out.printf("Name: %s \nSalary $%.2f\n", getName(), netSalary());
    }
    public void increaseSalary(double percentage){
        this.setGrossSalary(getGrossSalary() + (getGrossSalary() * percentage / 100));
    }
    }

