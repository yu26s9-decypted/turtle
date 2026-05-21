import java.awt.*;

public abstract class Shape
{
    // fields
    private Turtle turtle;
    private Point location;
    private Color color;
    private int border;

    // constructor
    public Shape(Turtle turtle, Point location, Color color, int border)
    {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }

    // getters
    public Turtle getTurtle()
    {
        return turtle;
    }

    public Point getLocation()
    {
        return location;
    }

    public Color getColor()
    {
        return color;
    }

    public int getBorder()
    {
        return border;
    }

    // setters
    public void setTurtle(Turtle turtle)
    {
        this.turtle = turtle;
    }

    public void setLocation(Point location)
    {
        this.location = location;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public void setBorder(int border)
    {
        this.border = border;
    }

    // abstract method
    public abstract void paint();
}