

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user details
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name:");
        String lastName = input.nextLine();

        System.out.print("Enter your gender: ");
        String gender = input.nextLine();

        System.out.print("Enter your birth day (1-31):");
        int birthDay = input.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = input.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();

        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        // HealthProfile object
        HealthProfile profile1 = new HealthProfile(
                firstName, lastName, gender,
                birthDay, birthMonth, birthYear,
                height, weight);

        // profile
        System.out.println("\n   Health Profile   ");
        System.out.printf("Name: %s %s%n", profile1.getFirstName(), profile1.getLastName());
        System.out.printf("Gender: %s%n", profile1.getGender());
        System.out.printf("Date of Birth: %d/%d/%d%n", profile1.getBirthDay(), profile1.getBirthMonth(), profile1.getBirthYear());
        System.out.printf("Age (in 2025): %d years%n", profile1.getAge());
        System.out.printf("Height: %f inches%n", profile1.getHeightInInches());
        System.out.printf("Weight: %f pounds%n", profile1.getWeightInPounds());
        System.out.printf("BMI: %f%n", profile1.getBMI());
        System.out.printf("Target Heart Rate Range: %s%n", profile1.getTargetHeartRateRange());
        System.out.println("\n" + profile1.getBMIChart());

        input.close();
    }
}