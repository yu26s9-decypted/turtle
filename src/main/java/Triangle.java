import java.awt.*;

public class Triangle extends Shape
{
    private int size;

    public Triangle(Turtle turtle, Point location, Color color,
                    int border, int size)
    {
        super(turtle, location, color, border);
        this.size = size;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
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

        for(int i = 0; i < 3; i++)
        {
            turtle.forward(size);
            turtle.turnRight(120);
        }

        turtle.penUp();
    }
}