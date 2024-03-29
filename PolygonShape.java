/*
 *	===============================================================================
 *	PolygonShape.java : A shape that is a polygon.
 *  YOUR UPI:jbah189
 *	=============================================================================== */
import java.awt.*;
import java.util.Arrays;
//Complete the PolygonShape class
public class PolygonShape extends SquareShape{
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
        radius = st.ordinal() / 2;
        numberOfSides = st.ordinal();
        centre = new Point(st.ordinal()/2, st.ordinal()/2);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);

        int[] xCoordinates = new int[numberOfSides];
        int[] yCoordinates = new int[numberOfSides];

        for(int i = 0; i < numberOfSides; i++) {

        }
    }
}
