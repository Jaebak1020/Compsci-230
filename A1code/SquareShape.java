/**
 * ===============================================================================
 * SquareShape.java : A shape that is a square.
 * YOUR UPI: jbah189
 * =============================================================================== */
import java.awt.*;
//Complete the SquareShape class
public class SquareShape extends RectangleShape{
    public SquareShape() {
        super();
        height = DEFAULT_HEIGHT;
        width = DEFAULT_HEIGHT;
    }

    public SquareShape(int x, int y, int s, int pw, int ph, Color c, Color bc, PathType pt) {
        super(x, y, s, s, pw, ph, c, bc, pt);

    }
}