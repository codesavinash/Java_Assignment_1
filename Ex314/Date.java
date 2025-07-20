

public class Date { 
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
    this.month = month;
    this.day = day;
    this.year = year;
    }
    

    // Setters with if-else validation
    public void setMonth(int month) {
        if (month < 1) {
            System.out.println("Invalid month. changing to 1.");
            this.month = 1;
        } 
        else if (month > 12) {
            System.out.println("Invalid month. changing to 1.");
            this.month = 1;
        } 
        else {
            this.month = month;
        }
    }

    public void setDay(int day) {
        if (day < 1) {
            System.out.println("Invalid day. Setting to 1.");
            this.day = 1;
        } 
        else if (day > 31) {
            System.out.println("Invalid day. Setting to 1.");
            this.day = 1;
        } 
        else {
            this.day = day;
        }
    }

    public void setYear(int year) {
        if (year < 1) {
            System.out.println("Invalid year. Setting to 2000.");
            this.year = 2000;
        } 
        else {
            this.year = year;
        }
    }

    // Getters
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Display date using printf with leading zeros
    public void displayDate() {
        System.out.printf("%d/%d/%d%n", month, day, year);
    }
}   // class
