


public class RightTriangle {
    // Instance
    private int side1;
    private int side2;
    private int side3;

    // Constructor
    public RightTriangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Setter for side1
    public void setSide1(int side1) {
        this.side1 = side1;
    }

    // Setter for side2
    public void setSide2(int side2) {
        this.side2 = side2;
    }

    // Setter for side3
    public void setSide3(int side3) {
        this.side3 = side3;
    }

    // Getter for side1
    public int getSide1() {
        return side1;
    }

    // Getter for side2
    public int getSide2() {
        return side2;
    }

    // Getter for side3
    public int getSide3() {
        return side3;
    }

    // Method to check
    public void checkRightTriangle() {
        int a = side1 * side1;
        int b = side2 * side2;
        int c = side3 * side3;

        // Check using Pythagorean theorem (got from internet)
        if (a + b == c || a + c == b || b + c == a) {
            System.out.println("These sides can form a right triangle.");
        } else {
            System.out.println("These sides cannot form a right triangle.");
        }
    }
}