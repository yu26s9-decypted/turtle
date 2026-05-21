import java.awt.*;

public class Rectangle extends Shape
{
    private int width;
    private int height;

    public Rectangle(Turtle turtle, Point location, Color color,
                     int border, int width, int height)
    {
        super(turtle, location, color, border);
        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public void paint()
    {
        Turtle turtle = getTurtle();

        turtle.penUp();
        turtle.goTo(getLocation().x, getLocation().y);

        turtle.setColor(getColor());
        turtle.setPenWidth(getBorder());

        turtle.penDown();

        for(int i = 0; i < 2; i++)
        {
            turtle.forward(width);
            turtle.turnRight(90);

            turtle.forward(height);
            turtle.turnRight(90);
        }

        turtle.penUp();
    }
}