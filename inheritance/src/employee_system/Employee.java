package employee_system;

public class Employee {
    private String name;
    private double salary;

    public String getInfo(){
        return "Name: " + name +  ", Salary: $" + salary + ", Bonus: $" + calculateBonus() + ", Updated Salary: $" + (salary + calculateBonus()) ;
    }
    public double calculateBonus(){
        return 0;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
