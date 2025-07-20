import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        // Ask for square size
        do {
            System.out.print("Enter the size of the square (1-20): ");
            size = input.nextInt();
        } while (size < 1 || size > 20);

        int row = 1;

        while (row <= size) {
            int column = 1;

            while (column <= size) {
                // border asteriks
                System.out.print(
                    (row == 1 || row == size || column == 1 || column == size) ? "*" : " "
                );
                ++column;
            }

            System.out.println(); // next rov
            ++row;
        }

        input.close();
    }
}   // class