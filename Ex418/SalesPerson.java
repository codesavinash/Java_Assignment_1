public class SalesPerson {

    // Instance 
    private double totalSales;

    // Constructor
    public SalesPerson() {
        totalSales = 0.0;
    }

    // Method: Adds value of sold item
    public void addItem(int itemNumber) {
        switch (itemNumber) {
            case 1:
                totalSales += 239.99;
                break;
            case 2:
                totalSales += 129.75;
                break;
            case 3:
                totalSales += 99.95;
                break;
            case 4:
                totalSales += 350.89;
                break;
            default:
                System.out.println("Invalid item number.");
        }
    }

    // Method: Getter - Returns the total sales amount
    public double getTotalSales() {
        return totalSales;
    }

    // Method: Calculates and returns the earnings
    public double calculateEarnings() {
        return 200 + (0.09 * totalSales);
    }
}   //class