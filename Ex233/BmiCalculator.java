

public class BmiCalculator {
    private double weight; // pounds
    private double height; // inches

    // Constructor
    public BmiCalculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // Setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return (weight * 703.0) / (height * height);
    }
}
