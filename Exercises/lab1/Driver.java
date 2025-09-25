package lab1;

public class Driver
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            Rectangle rect = new Rectangle();
            rect.setWidth((int) (Math.random() * 101));
            rect.setHeight((int) (Math.random() * 101));
            int area = rect.getArea();
            System.out.println("The area of rectangle " + i +" is " + area);
        }

        for (int i = 0; i < 10; i++)
        {
            Circle circle = new Circle();
            circle.setRadius((int) (Math.random() * 101));
            int area = circle.getArea();
            System.out.println("The integer value of the area of circle " + i +" is " + area);
        }
    }


}
