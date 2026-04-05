
import java.util.Scanner;

public class SimpleInterestCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("### Simple Interest Calculation ###");
        System.out.print("Enter the loan amount: ");
        float loan = scanner.nextFloat();
        System.out.print("Enter the interest rate : ");
        float interestRate = scanner.nextFloat();
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        float interest = (loan * interestRate * months)/100;

        System.out.printf("the interest amount is: $%.2f", interest);

        scanner.close();

    }
}

