/*
 *	===============================================================================
 *	PolygonShape.java : A shape that is a polygon.
 *  YOUR UPI:jbah189
 *	=============================================================================== */
import java.awt.*;
import java.util.Arrays;
//Complete the PolygonShape class
public class PolygonShape extends RectangleShape{
    private int radius;
    private int numberOfSides;
    private Point centre;

    public PolygonShape() {
        radius = DEFAULT_HEIGHT/2;
        numberOfSides = 6; // says something about being determined by enum
        centre = new Point(DEFAULT_HEIGHT/2, DEFAULT_HEIGHT/2);
    }

    public PolygonShape(int x, int y, int s, int pw, int ph, Color c, Color bc, PathType pt, ShapeType st) {
        super(x, y, s, pw, ph, c, bc, pt);
        ShapeType polygon = ShapeType.valueOf(numberOfSides);
    }
}
