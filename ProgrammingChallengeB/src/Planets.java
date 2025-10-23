import java.awt.*;

public class Planets {
    public static void main(String[] args) {
        CircleViewer.launch();

        Circle circle1 = new Circle(140, Color.MAGENTA);
        Circle circle2 = new Circle(20, Color.BLACK);
        Circle circle3 = new Circle(40, Color.BLUE);
        Circle circle4 = new Circle(70, Color.GREEN);

        circle1.setPosition(50, 100);
        circle2.setPosition(100, 50);
        circle3.setPosition(80, -50);
        circle4.setPosition(-85, -50);
    }
}
