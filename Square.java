/**
 * Represents a square with a given side length.
 * Implements the Shape interface.
 */
public class Square implements Shape {

    private double side;

    /**
     * Constructs a Square with the specified side length.
     *
     * @param side the length of one side of the square
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Calculates the area of the square.
     *
     * @return the area of the square
     */
    @Override
    public double getArea() {
        return side * side;
    }

    /**
     * Returns the class name of the square.
     *
     * @return the string "Square"
     */
    @Override
    public String getClassName() {
        return "Square";
    }

    /**
     * Returns a string representation of the square.
     *
     * @return the square's side information
     */
    @Override
    public String toString() {
        return "Square (s=" + side + ")";
    }
}

