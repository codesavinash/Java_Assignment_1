

import java.util.Scanner;

public class NumberOpTest {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        // object of NumberOp
        NumberOp numberOp1 = new NumberOp(num1, num2, num3);

        // Results
        System.out.println("Sum: " + numberOp1.getSum());
        System.out.println("Average: " + numberOp1.getAverage());
        System.out.println("Product: " + numberOp1.getProduct());
        System.out.println("Smallest: " + numberOp1.getSmallest());
        System.out.println("Largest: " + numberOp1.getLargest());
        input.close(); // Close the scanner
  
    }
}
