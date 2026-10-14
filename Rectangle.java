/**
 * Represents a rectangle with a width and length.
 * Implements the Shape interface.
 */
public class Rectangle implements Shape {

    private double width;
    private double length;

    /**
     * Constructs a Rectangle with the specified dimensions.
     *
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Returns the class name of the rectangle.
     *
     * @return the string "Rectangle"
     */
    @Override
    public String getClassName() {
        return "Rectangle";
    }

    /**
     * Returns a string representation of the rectangle.
     *
     * @return the rectangle's dimensions
     */
    @Override
    public String toString() {
        return "Rectangle (" + width + "x" + length + ")";
    }
}

