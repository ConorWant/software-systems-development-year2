package lab1;

/**
 * Ellipse class that extends the Rectangle class.
 * Width and height are the length of the semi-axis of the ellipse.
 * Provides methods to calculate area and display ellipse information.
 */
public class Ellipse extends Rectangle
{
    /**
     * Default constructor that sets the number of sides to one.
     */
    public Ellipse()
    {
        this.setSides(1);
    };

    @Override
    public int getArea()
    {
        return (int) (getWidth() * getHeight() * Math.PI);
    }

    @Override
    public String toString()
    {
        return "The ellipse has a width of " + getWidth() + ", a height of " + getHeight() + ", an area of " + getArea()
                + ", and " + getSides() + " sides";
    }
}
