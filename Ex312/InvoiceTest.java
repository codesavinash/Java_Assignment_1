

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // inputs from user
        System.out.print("Enter part number: ");
        String partNumber = input.nextLine();

        System.out.print("Enter part description: ");
        String partDescription = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = input.nextDouble();

        // object using constructor
        Invoice invoice1 = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        // Display invoice details
        System.out.println("\nInvoice Details:");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Part Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.printf("Price per Item: $%.2f%n", invoice1.getPricePerItem());
        System.out.printf("Total Invoice Amount: $%.2f%n", invoice1.getInvoiceAmount());

        input.close();
    }
}
