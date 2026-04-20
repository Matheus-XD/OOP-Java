package employee_salary_raise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter name: ");
        String name = scanner.nextLine();
        System.out.print("enter the gross salary: ");
        double grossSalary = scanner.nextDouble();
        System.out.print("enter tax: ");
        double tax = scanner.nextDouble(); 
        
        Employee e1 = new Employee();
        
        e1.setName(name);
        e1.setGrossSalary(grossSalary);
        e1.setTax(tax);

        e1.status();
        System.out.print("enter the increase percentage: ");
        double percentage = scanner.nextDouble();
        e1.increaseSalary(percentage);
        e1.status();
        scanner.close();
    }
}
