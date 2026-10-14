
package edu.txst.assignment2;

/**
 * Represents a circle with a given radius.
 * Implements the Shape interface.
 */
public class Circle implements Shape {

    private double radius;

    /**
     * Constructs a Circle with the specified radius.
     *
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area of the circle
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the class name of the circle.
     *
     * @return the string "Circle"
     */
    @Override
    public String getClassName() {
        return "Circle";
    }

    /**
     * Returns a string representation of the circle.
     *
     * @return the circle's radius information
     */
    @Override
    public String toString() {
        return "Circle (r=" + radius + ")";
    }
}

