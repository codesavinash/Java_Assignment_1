

public class EmployeeTest {
    public static void main(String[] args) {
        // two Employee objects
        Employee employee1 = new Employee("Anoop", "Thomas", 3500.00);
        Employee employee2 = new Employee("Vishnu", "Nair", 4200.00);

        // yearly salaries
        System.out.printf("%s %s's yearly salary: $%.2f%n",
            employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's yearly salary: $%.2f%n",
            employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

        // Give each a 10% raise
        employee1.raiseSalary(10);
        employee2.raiseSalary(10);

        System.out.println("\nAfter 10% raise:");

        // Display new yearly salaries
        System.out.printf("%s %s's yearly salary: $%f%n",
            employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("%s %s's yearly salary: $%f%n",
            employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
   
    }
}
