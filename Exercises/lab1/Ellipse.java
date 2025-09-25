package lab1;

public class Ellipse extends Rectangle
{
    public Ellipse()
    {
        setSides(1);
    };

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
