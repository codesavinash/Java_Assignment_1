

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user for input
        System.out.print("Enter first name:");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth day (between 1 to 31): ");
        int day = input.nextInt();

        System.out.print("Enter birth month (between 1 to 12): ");
        int month = input.nextInt();

        System.out.print("Enter birth year: ");
        int year = input.nextInt();

        // object
        HeartRates person1 = new HeartRates(firstName, lastName, day, month, year);

        // details
        System.out.println("\n  Heart Rate Details   ");
        System.out.printf("Name: %s %s\n", person1.getFirstName(), person1.getLastName());
        System.out.printf("Date of Birth: %02d/%02d/%d\n", person1.getBirthDay(), person1.getBirthMonth(), person1.getBirthYear());
        System.out.println("Age (in 2025): " + person1.getAge());
        System.out.println("Maximum Heart Rate: " + person1.getMaxHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + person1.getTargetHeartRateRange());

        input.close();
    }
}