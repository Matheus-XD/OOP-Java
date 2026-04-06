
import java.util.Scanner;
public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        

        System.out.println("### GPA calculator ###");
        for (int i = 1; i <= 4; i++){
            double grade = -1;
            while (grade < 0 || grade > 10){
                System.out.printf("Enter the %dth grade: ", i);
                grade = scanner.nextDouble();
                if (grade < 0 || grade > 10){
                    System.out.println("You must enter a valid grade!");
                }
            }
            sum = sum + grade;
        }

        double gpa = sum/4;

        System.out.printf("### Result #### %nGPA: %.1f%n", gpa );
        System.out.println(gpa >= 6 ? "Approved":"Failed");
        scanner.close();
    }
}
