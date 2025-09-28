package lab1;

/**
 * Circle class that extends the Shape class.
 * Provides methods to calculate area and display circle information.
 */
public class Circle extends Shape
{
    /**
     * The circle radius
     */
    private int radius;

    /**
     * Default constructor that calls the Shape constructor and sets the number of sides to one
     */
    public Circle ()
    {
        super(1);
    }

    /**
     * Getter method for the radius of the circle.
     * @return radius of the circle.
     */
    public int getRadius()
    {
        return radius;
    }

    /**
     * Setter method for the radius of the circle.
     * @param radius the radius of the new circle.
     */
    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public int getArea()
    {
        return (int) (radius * radius * Math.PI);
    };

    @Override
    public String toString()
    {
        return "The circle has a radius of " + radius + ", an area of " + getArea() + " and " + getSides() + " sides.";
    }
}
