

public class CompareInteger {
    private int number1;
    private int number2;

    // Constructor
    public CompareInteger(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Setters
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    // Getters
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    // Method to compare numbers
    public String compare() {
        if (number1 > number2)
            return number1 + " is larger.";
        else if (number2 > number1)
            return number2 + " is larger.";
        else
            return "These numbers are equal.";
    }
}
