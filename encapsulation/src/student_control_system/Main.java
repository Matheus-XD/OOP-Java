package student_control_system;

public class Main {
    public static void main(String[] args) {
        Student a1 = new Student(183463);

        a1.setNome("Junior");
        a1.setIdade(130);
        a1.setNotaFinal(15);

        a1.status();
    }
}
