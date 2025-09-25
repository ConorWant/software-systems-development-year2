package lab1;

public class Circle extends Shape
{
    private int radius;

    public Circle ()
    {
        super(1);
    }
    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

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
