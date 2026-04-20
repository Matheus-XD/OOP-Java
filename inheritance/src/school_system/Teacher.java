package school_system;
public class Teacher extends Person {
    private String specialty;
    private double salary;


    //Getters
    public String getSpecialty() {
        return specialty;
    }
    public double getSalary() {
        return salary;
    }
    //Setters
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Business methods
    public void salaryRaise(double salary){
        this.salary+= salary;
    }
    @Override
    public String toString() {
        return "Teacher [specialty=" + specialty + ", salary=" + salary + "]";
    }
    
}
