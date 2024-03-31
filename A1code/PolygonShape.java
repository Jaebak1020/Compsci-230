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
        numberOfSides = 6;
        centre = new Point(DEFAULT_HEIGHT/2, DEFAULT_HEIGHT/2);
    }

    public PolygonShape(int x, int y, int s, int pw, int ph, Color c, Color bc, PathType pt, ShapeType st) {
        super(x, y, s, pw, ph, c, bc, pt);
        radius = s/2;
        numberOfSides = st.getNumberOfSides();
        centre = new Point(x + radius, y + radius);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        centre.move(x + radius,y + radius);

        int[] xCoordinates = new int[numberOfSides];
        int[] yCoordinates = new int[numberOfSides];


        for(int i = 0; i < numberOfSides; i++) {
            double angle = (i * 2 * Math.PI)/numberOfSides;
            xCoordinates[i] = (int)((double)centre.x + ((double)radius * Math.cos(angle)));
            yCoordinates[i] = (int)((double)centre.y + ((double)radius * Math.sin(angle)));
        }
        System.out.printf("%s:%s,%s\n", getClass().getName(), Arrays.toString(xCoordinates), Arrays.toString(yCoordinates));
    }
}