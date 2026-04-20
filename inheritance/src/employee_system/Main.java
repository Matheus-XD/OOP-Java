package employee_system;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Manager m1 = new Manager();
        Developer d1 = new Developer();
        Intern i1 = new Intern();

        e1.setName("Matheus");
        e1.setSalary(1000);
        m1.setName("joão");
        m1.setSalary(1000);
        d1.setName("Lucas");
        d1.setSalary(1000);
        i1.setName("Marcos");
        i1.setSalary(1000);

        System.out.println(e1.getInfo());
        System.out.println(m1.getInfo());
        System.out.println(d1.getInfo());
        System.out.println(i1.getInfo());
    }
}
