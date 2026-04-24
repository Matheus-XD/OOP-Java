package workers_payment_system;

public class Main {
    public static void main(String[] args) {
        Worker workers [] = new Worker[3];
        


        PartTime pt = new PartTime();
        FullTime ft = new FullTime();
        Outsourced os = new Outsourced();

        System.out.println(pt.calculateSalary());
        System.out.println(ft.calculateSalary());
        System.out.println(os.calculateSalary());
    }
}
