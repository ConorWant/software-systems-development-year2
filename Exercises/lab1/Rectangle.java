package lab1;

public class Rectangle extends Shape
{
    private int height;
    private int width;

    public Rectangle()
    {
        super(4);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

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
