import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("### Body Mass index calculator ###");
        System.out.println("Enter your weight: ");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height: ");
        float height = scanner.nextFloat();

        float bmi = weight / (height * height);

        System.out.println("### RESULT ###");
        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Normal weight");
        }
        else if (bmi >= 25 && bmi <= 29.9){
            System.out.println("Overweight");
        }
        else if (bmi >= 30 && bmi <= 34.99){
            System.out.println("Grade I obesity");
        }
        else if (bmi >= 35 && bmi <= 39.99){
            System.out.println("Grade II obesity");
        }
        else if (bmi >= 40){
            System.out.println("Grade III obesity (morbid)");
        }
        else {
            System.out.println("error!");
        }  

        scanner.close();
    }
}
