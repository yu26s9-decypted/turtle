import java.awt.*;

public class Circle extends Shape
{
    private int radius;

    public Circle(Turtle turtle, Point location, Color color,
                  int border, int radius)
    {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public void paint()
    {
        Turtle turtle = getTurtle();

        // move turtle to starting position
        turtle.penUp();
        turtle.goTo(getLocation().x, getLocation().y);

        // style
        turtle.setColor(getColor());
        turtle.setPenWidth(getBorder());

        turtle.penDown();

        // approximate a circle using many small lines
        int sides = 60;

        double circumference = 2 * Math.PI * radius;
        double stepLength = circumference / sides;
        double angle = 360.0 / sides;

        for(int i = 0; i < sides; i++)
        {
            turtle.forward(stepLength);
            turtle.turnRight(angle);
        }

        turtle.penUp();
    }
}