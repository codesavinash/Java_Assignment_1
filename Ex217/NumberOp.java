

public class NumberOp {
    private int number1;
    private int number2;
    private int number3;

    // Constructor
    public NumberOp(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    // Getters
    public int getNumber1() { return number1; }
    public int getNumber2() { return number2; }
    public int getNumber3() { return number3; }

    // Setters
    public void setNumber1(int n1) { number1 = n1; }
    public void setNumber2(int n2) { number2 = n2; }
    public void setNumber3(int n3) { number3 = n3; }

    // Sum
    public int getSum() {
        return number1 + number2 + number3;
    }

    // Average (integer division)
    public int getAverage() {
        return (number1 + number2 + number3) / 3;
    }

    // Product
    public int getProduct() {
        return number1 * number2 * number3;
    }

    // Smallest
    public int getSmallest() {
        int smallest = number1;
        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;
        return smallest;
    }

    // Largest
    public int getLargest() {
        int largest = number1;
        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;
        return largest;
        
  
    }

} // class
