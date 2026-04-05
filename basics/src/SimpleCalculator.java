
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("### Calculator ### \ntype: \n1 for adittion \n2 for subtraction \n3 for multiplication \n4 for division");
        int operation = 0;
        while (operation < 1 || operation > 4 ){
            System.out.println("operation: ");
            operation = scanner.nextInt();
            if (operation < 1 || operation > 4 ){
                System.out.println("type a valid operation!");
            }
        }  

        System.out.println("Type the first number: ");
        float n1 = scanner.nextFloat();
        System.out.println("Type the second number: ");
        float n2 = scanner.nextFloat();
 

        System.out.println("### Result ###");
        if (operation == 1 ){
            System.out.printf("%.1f + %.1f = %.1f", n1, n2, n1 + n2 );
        }
        else if (operation == 2){
            System.out.printf("%.1f - %.1f = %.1f", n1, n2, n1 - n2 );
        }
        else if (operation == 3){
            System.out.printf("%.1f x %.1f = %.1f", n1, n2, n1 * n2 );
        }
        else if (operation == 4) {
            if (n2 == 0){
                System.out.println("Cannot divide by zero!");
            }
            else{
                System.out.printf("%.1f / %.1f = %.1f", n1, n2, (float) n1 / n2 );
            }
            
        }
  
        scanner.close();
    }
}
