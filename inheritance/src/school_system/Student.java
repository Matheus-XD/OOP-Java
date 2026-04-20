package school_system;
public class Student extends Person {
    private int registration;
    private String subject;
    private double fee = 1000;
    

    //Getters
    public int getRegistration() {
        return registration;
    }
    public String getSubject() {
        return subject;
    }
    public double getFee(){
        return fee;
    }
    //Setters
    public void setRegistration(int registration) {
        this.registration = registration;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    //Business methods
    public void cancelEnrrolment(){
        System.out.println("Enrrolment will be canceled...");
    }
    public void payfee(){
        System.out.printf("$%.2f monthly fee has been paid \n", fee);
    }
    
    @Override
    public String toString() {
        
        return "Student [name=" + this.getName() + ", age=" + getAge() + ", sex=" + getSex() + "registration=" + registration + ", subject=" + subject + "]";
    }

}
