package workers_payment_system;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = {
            new FullTime(),
            new PartTime(),
            new Outsourced()
        };

        for (Worker w : workers) {
            System.out.println(w.calculateSalary());
        }
    }
}
