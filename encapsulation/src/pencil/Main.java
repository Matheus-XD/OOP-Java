package pencil;

    public class Main {
            public static void main(String[] args) {
            Pencil pen1 = new Pencil(100, true);
            
            pen1.setModel("Bic");
            pen1.setColor("Blue");
            pen1.setTip(0.7f);
            pen1.setCharge(25);
            pen1.setCapped(true);


            pen1.status();
            pen1.uncap();
            pen1.status();
            pen1.write();

    }
}
