

import java.util.Scanner;

public class BmiCalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();

        // Create object from BmiCalculator
        BmiCalculator bmiCalculator1 = new BmiCalculator(weight, height);

        // Calculate BMI
        double bmi = bmiCalculator1.calculateBMI();

        // Output
        System.out.printf("%nYour BMI is: %.2f%n", bmi);

        System.out.println("\nBMI Categories:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      18.5 to 24.9");
        System.out.println("Overweight:  25 to 29.9");
        System.out.println("Obese:       30 or greater");

        input.close();
    }
}
