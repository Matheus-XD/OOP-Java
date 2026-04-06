package Employee_salary_raise;

public class Main {
    public static void main(String[] args){
        Employee employee1 = new Employee();
        employee1.name = "joão silva";
        employee1.grossSalary = 6000f;
        employee1.tax = 1000f;

        employee1.status();

        employee1.increaseSalary(10);

        employee1.status();
    }
}
