package school_system;
public class Main {
    public static void main(String[] args) {

        Guest g1 = new Guest();
        ScholarshipStudent ss1 = new ScholarshipStudent();
        Student s1 = new Student();


        g1.setName("Maicon");
        g1.setAge(34);
        g1.setSex("male");
        ss1.setName("Julia");
        ss1.setScholarship(600);
        ss1.setSubject("English");
        s1.setName("Matheus");
        s1.setSubject("Science");

        System.out.println(g1.toString());
        System.out.println(ss1.toString());
        System.out.println(s1.toString());
        
        s1.payfee();
        ss1.payfee();
    }
}
