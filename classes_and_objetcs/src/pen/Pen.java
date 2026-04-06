package pen;

public class Pen {
    public String model;
    public String color;
    public float tip;
    public int charge;
    private boolean capped;

    public void status(){
        System.out.printf("Model: %s\n", this.model);
        System.out.printf("Color: %s\n", this.color);
        System.out.printf("Tip: %.1fmm\n", this.tip);
        System.out.printf("Charge: %d%%\n", this.charge);
        System.out.printf("Closed: %b\n", this.capped);
    }

    public void write(){
        if (this.capped == true){
            System.out.println("Can't write");
        } 
        else {
            System.out.println("I can write");
        }
    }

    public void cap(){
        System.out.println("Capping...");
        this.capped = true;
    }

    public void uncap(){
        System.out.println("Uncapping...");
        this.capped = false;
    }


}
