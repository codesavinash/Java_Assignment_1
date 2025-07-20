
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Created 3 employees
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        int count = 0;
        int totalEmployees = 3;

        // Loop for 3 employees
        while (count < totalEmployees) {
            System.out.printf("Enter data for Employee %d:%n", count + 1);

            System.out.print("Hours worked: ");
            double hours = input.nextDouble();

            System.out.print("Hourly rate: ");
            double rate = input.nextDouble();

            switch (count) {
                case 0:
                    emp1.setHoursWorked(hours);
                    emp1.setHourlyRate(rate);
                    break;
                case 1:
                    emp2.setHoursWorked(hours);
                    emp2.setHourlyRate(rate);
                    break;
                case 2:
                    emp3.setHoursWorked(hours);
                    emp3.setHourlyRate(rate);
                    break;
                default:
                    System.out.println("Error: Invalid employee.");
                    break;
            }

            count++;
            System.out.println(); 
        }

        // Display gross pay for each employee
        System.out.printf("Employee 1 Gross Pay: $%.2f%n", emp1.getGrossPay());
        System.out.printf("Employee 2 Gross Pay: $%.2f%n", emp2.getGrossPay());
        System.out.printf("Employee 3 Gross Pay: $%.2f%n", emp3.getGrossPay());

        input.close();
    }
}