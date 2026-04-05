
import java.util.Scanner;
public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double g1 = -1, g2 = -1, g3 = -1;

        while (g1 < 0 || g1 > 10){
            System.out.print("Enter the first grade: ");
            g1 = scanner.nextDouble();
            if (g1 < 0 || g1 > 10){
                System.out.println("You must enter a valid grade!");
            }
        }
        while (g2 < 0 || g2 > 10){
            System.out.print("Enter the second grade: ");
            g2 = scanner.nextDouble();
            if (g2 < 0 || g2 > 10){
                System.out.println("You must enter a valid grade!");
            }
        }
        while (g3 < 0 || g3 > 10){
            System.out.print("Enter the third grade: ");
            g3 = scanner.nextDouble();
            if (g3 < 0 || g3 > 10){
                System.out.println("You must enter a valid grade!");
            }
        }
        System.out.println("### GPA calculator ###");


        System.out.printf("### Result ### \nGPA: %.1f", (g1 + g2 + g3)/3);

        scanner.close();
    }
}
