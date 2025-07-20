

    import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Enter month (1 to 12): ");
        int month = input.nextInt();

        System.out.print("Enter day: ");
        int day = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Date object with user input
        Date date1 = new Date(month, day, year);

        // Result
        System.out.print("The date is: ");
        date1.displayDate();

        input.close();
    }
}
