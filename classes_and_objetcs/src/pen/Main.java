package pen;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();

        pen1.model = "Bic";
        pen1.color = "Blue";
        pen1.tip = 0.7f;
        pen1.charge = 50;

        pen1.status();
        pen1.cap();
        pen1.status();
        pen1.write();

    }
}
