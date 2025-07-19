

import java.util.Scanner;

public class CompareIntegerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Create object and compare
        CompareInteger comparator = new CompareInteger(num1, num2);
        String result = comparator.compare();

        // Output Result
        System.out.println(result);

        input.close();
    }
}
