

public class Triangle {
    private int side1;
    private int side2;
    private int side3;


    //constructor
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void checkTriangle() {
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                System.out.println("These sides CAN form a triangle.");
            } else {
                System.out.println("These sides CANNOT form a triangle.");
            }
        } else {
            System.out.println("All sides must be greater than zero.");
        }
    }
}   // class
