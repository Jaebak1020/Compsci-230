/**
 *	===============================================================================
 *	RectangleShape.java : A shape that is a rectangle.
 *  YOUR UPI: jbah189
 *	=============================================================================== */
import java.awt.*;
//Complete the RectangleShape class
public class RectangleShape extends Shape{
    public RectangleShape() {
        super();
    }

    public RectangleShape(int x, int y, int w, int h, int pw, int ph, Color c, Color bc, PathType pt) {
        super(x, y, w, h, pw, ph, c, bc, pt);
    }

    @Override
    public void draw(Graphics g) {
        System.out.println(this.color);
        System.out.println(this.borderColor);
        System.out.println(super.toString());
    }
}