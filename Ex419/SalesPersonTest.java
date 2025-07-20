
import java.util.Scanner;

public class SalesPersonTest {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // SalesPerson object 
        SalesPerson salesperson1 = new SalesPerson();

        // Variable to store item number entered by user
        int itemNumber;

        System.out.println("Enter the item numbers sold by the salesperson.");
        System.out.println("Valid items: 1 ($239.99), 2 ($129.75), 3 ($99.95), 4 ($350.89)");
        System.out.println("Enter 0 to finish input.");

        // Loop to collect item numbers from user
        while (true) {
            System.out.print("Enter item number (1-4) or 0 to finish: ");
            itemNumber = input.nextInt();

            if (itemNumber == 0) {
                break;
            }

            salesperson1.addItem(itemNumber);
        }

        // Display the total sales and earnings
        System.out.printf("Total Sales: $%.2f%n", salesperson1.getTotalSales());
        System.out.printf("Total Earnings: $%.2f%n", salesperson1.calculateEarnings());

        // Close the Scanner
        input.close();
    }
}