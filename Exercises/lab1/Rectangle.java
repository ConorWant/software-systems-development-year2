package lab1;

/**
 * Rectangle class that extends the Shape class.
 * Provides methods to calculate area and display rectangle information.
 */
public class Rectangle extends Shape
{
    /**
     * The height of the rectangle.
     */
    private int height;
    /**
     * The width of the rectangle.
     */
    private int width;

    /**
     * Default constructor that calls the Shape constructor and sets the number of sides to four.
     */
    public Rectangle()
    {
        super(4);
    }

    /**
     * Getter method for width of the rectangle.
     * @return the width of the rectangle
     */
    public int getWidth() {
        return width;
    }

    /**
     * Setter method for the width of the rectangle
     * @param width the width of the new rectangle
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Getter method for height of the rectangle.
     * @return the height of the rectangle
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter method for the height of the rectangle
     * @param height the height of the new rectangle
     */
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea()
    {
        return width * height;
    }

    @Override
    public String toString()
{
    return "The rectangle has a width of " + getWidth() + ", a height of " + getHeight() + ", an area of " + getArea()
            + " and has " + getSides() + " sides";
}


}
