public class Employee {

    // Instance 
    private double hoursWorked;
    private double hourlyRate;

    // Constructor
    public Employee() {
        hoursWorked = 0.0;
        hourlyRate = 0.0;
    }

    // Setters
    public void setHoursWorked(double hours) {
        if (hours >= 0)
            this.hoursWorked = hours;
        else
            System.out.println("Invalid hours!");
    }

    public void setHourlyRate(double rate) {
        if (rate >= 0)
            this.hourlyRate = rate;
        else
            System.out.println("Invalid rate!");
    }

    // Gross pay calculation
    public double getGrossPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyRate;
        } else {
            double overtime = hoursWorked - 40;
            return (40 * hourlyRate) + (overtime * hourlyRate * 1.5);
        }
    }
}   // class