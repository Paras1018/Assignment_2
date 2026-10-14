/**
 * Represents a triangle with a base and height.
 * Implements the Shape interface.
 */
public class Triangle implements Shape {

    private double base;
    private double height;

    /**
     * Constructs a Triangle with the specified base and height.
     *
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Calculates the area of the triangle.
     *
     * @return the area of the triangle
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Returns the class name of the triangle.
     *
     * @return the string "Triangle"
     */
    @Override
    public String getClassName() {
        return "Triangle";
    }

    /**
     * Returns a string representation of the triangle.
     *
     * @return the triangle's base and height information
     */
    @Override
    public String toString() {
        return "Triangle (b=" + base + ", h=" + height + ")";
    }
}

