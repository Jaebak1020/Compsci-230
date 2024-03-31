import java.awt.*;

public class Main {
    public static void main(String[] args) {


        RectangleShape r1 = new RectangleShape(145,297,50,100,400,400,Color.pink,Color.yellow,PathType.DOWN_RIGHT);
        for (int i=0; i<5; i++) {
            r1.move(); r1.draw(null);
        }
    }
}
