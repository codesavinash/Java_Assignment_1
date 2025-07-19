
    import java.util.Scanner;

public class ArithmeticTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Enter first number :");
        double num1 = input.nextDouble();

        System.out.print("Enter second number :");
        double num2 = input.nextDouble();

        // Arithematic Object
        Arithmetic calc = new Arithmetic(num1, num2);

        // Results
        System.out.printf("Sum is : %f%n", calc.getSum());
        System.out.printf("Product is : %f%n", calc.getProduct());
        System.out.printf("Difference is : %f%n", calc.getDifference());

        if (num2 !=0)
            System.out.printf("Quotient is %f%n", calc.getQuotient());
        else
            System.out.println("Cannot divide by zero");    
        
        input.close();    

    }
}
