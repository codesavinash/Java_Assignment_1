

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1: ");
        int side1 = input.nextInt();

        System.out.print("Enter side2: ");
        int side2 = input.nextInt();

        System.out.print("Enter side3: ");
        int side3 = input.nextInt();

        Triangle triangle1 = new Triangle(side1, side2, side3);
        triangle1.checkTriangle();

        input.close();
    }
}
