public class Arithmetic{
  private double number1;
  private double number2;

  // Constructor
  public Arithmetic(double number1, double number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  // Setter for number1
  public void setNumber1(double number1) {
    this.number1 = number1;
  }

  // Setter for number2
  public void setNumber2(double number2) {
    this.number2 = number2;
  }

  // Getter for Sum
  public double getSum() {
    return number1 + number2;
  }

  // Getter for Product
  public double getProduct() {
    return number1 * number2;
  }

  // Getter for Difference
  public double getDifference() {
    return number1 - number2;
  }

  // Getter for Quotient
  public double getQuotient() {
    if (number2 != 0)
      return number1 / number2;
    else
      return 0; // Avoid division by zero
  }
}
