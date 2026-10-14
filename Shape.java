/**
 * Represents a geometric shape.
 * This interface provides methods to calculate
 * the area of a shape and return its class name.
 */
public interface Shape {

    /**
     * Calculates the area of the shape.
     * @return the area of the shape
     */
    double getArea();

    /**
     * Returns the class name of the shape.
     * @return the name of the shape class
     */
    String getClassName();
}

