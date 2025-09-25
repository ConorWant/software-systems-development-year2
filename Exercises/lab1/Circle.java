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

}
