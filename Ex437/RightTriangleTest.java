

import java.util.Scanner;

public class RightTriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter side1: ");
        int side1 = input.nextInt();

        System.out.print("Enter side2: ");
        int side2 = input.nextInt();

        System.out.print("Enter side3: ");
        int side3 = input.nextInt();

        // Check that sides are not zero
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            // RightTriangle object
            RightTriangle triangle1 = new RightTriangle(side1, side2, side3);

            // Call method to check if it forms a right triangle
            triangle1.checkRightTriangle();
        } else {
            System.out.println("Sides must be greater than zero.");
        }

        input.close();
    }
}