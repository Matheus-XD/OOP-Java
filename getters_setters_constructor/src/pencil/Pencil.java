package pencil;

public class Pencil {
    private String model;
    private String color;
    private float tip;
    private int charge;
    private boolean capped;

    public Pencil(int charge, boolean capped){
        this.setCharge(charge); 
        this.capped = capped; 
    }

    public String getModel(){
        return this.model;
    }
    public void setModel( String model){
        this.model = model;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public float getTip(){
        return this.tip;
    }
    public void setTip(float tip){
        this.tip = tip;
    }
    
    public int getCharge(){
        return this.charge;
    }
    public void setCharge(int charge){
        this.charge = charge;
    }
    public boolean getCapped(){
        return this.capped;
    }
    public void setCapped(boolean capped){
        this.capped = capped;
    }


    public void status(){
        System.out.printf("Model: %s\n", this.model);
        System.out.printf("Color: %s\n", this.color);
        System.out.printf("Tip: %.1fmm\n", this.tip);
        System.out.printf("Charge: %d%%\n", this.charge);
        System.out.printf("Capped: %b\n", this.capped);
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
