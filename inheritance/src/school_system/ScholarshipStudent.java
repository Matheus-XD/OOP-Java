package school_system;
public class ScholarshipStudent extends Student{
    private double scholarship;

    
    @Override
    public String toString() {
        return "ScholarshipStudent [Name=" + getName() + ", Age=" + getAge() + ", Sex=" + getSex() + "scholarship=" + scholarship + ", Registration="
                + getRegistration() + "]";
    }
    //business methods
    public void renewScholarship(){
        System.out.println("Scholarship has been renewed");
    }
    @Override
    public void payfee() {
        this.setFee(this.getFee() - scholarship);
        System.out.printf("$%.2f monthly fee has been paid \n", getFee());
    }
    
    //getter
    public double getScholarship() {
        return this.scholarship;
    }
    //setter
    public void setScholarship(double scholarship){
        this.scholarship = scholarship;
    }
    
}
