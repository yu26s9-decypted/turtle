import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(1000, 1000);
        Turtle turtle = new Turtle(world,-100, -100);
        
        int width = 1000;
        int height = 1000;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);





        turtle.goTo(300,300);

//        for(int i = 0; i < 3; i++)
//        {
//            turtle.forward(sideLength);
//            turtle.turnRight(120);
//        }
//        turtle.penUp();
//        turtle.goTo(100,200);
//        turtle.penDown();
//        for(int i = 0; i < 6; i++){
//            turtle.forward(sideLength);
//            turtle.turnRight(60);
//        }



        Rectangle rectangle = new Rectangle(
                turtle,
                new Point(-100, -50),
                Color.BLUE,
                3,
                200,
                100
        );

        Triangle triangle = new Triangle(
                turtle,
                new Point(0, 0),
                Color.BLUE,
                3,
                150
        );

        Hexagon hexagon = new Hexagon(
                turtle,
                new Point(100, 50),
                Color.MAGENTA,
                4,
                100
        );

        // draw the rectangle
        rectangle.paint();
        triangle.paint();
        hexagon.paint();


//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);
    }

    public static void drawRectangle(Turtle turtle){
        turtle.penDown();
        int sideLength = 50;
        for(int i = 0; i < 4; i++)
        {
            turtle.forward(sideLength);
            turtle.turnRight(90);
        }
        turtle.penUp();
    }

    // Equilateral Triangle
    public static void drawTriangle(Turtle turtle, int sideLength)
    {
        turtle.penDown();
        for(int i = 0; i < 3; i++)
        {
            turtle.forward(sideLength);
            turtle.turnRight(120);
        }
        turtle.penUp();
    }

    // Regular Hexagon
    public static void drawHexagon(Turtle turtle, int sideLength)
    {
        turtle.penDown();
        for(int i = 0; i < 6; i++)
        {
            turtle.forward(sideLength);
            turtle.turnRight(60);
        }
        turtle.penUp();
    }

    // Approximate Circle using many small lines
    public static void drawCircle(Turtle turtle, int radius)
    {
        turtle.penDown();

        int sides = 60; // fewer lines = faster drawing
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
