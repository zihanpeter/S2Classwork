import java.awt.*;

public class RandomCircles {
    public static int randomCoordinate() {
        return (int)(Math.random() * 301 - 150);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        CircleViewer.launch();

        Circle circleBlue = new Circle(20, Color.BLUE);
        Circle circleRed = new Circle(20, Color.RED);

        int blueX = randomCoordinate();
        int blueY = randomCoordinate();
        int redX = randomCoordinate();
        int redY = randomCoordinate();
        double dis = distance(redX, redY, blueX, blueY);

        circleBlue.setPosition(blueX, blueY);
        circleRed.setPosition(redX, redY);

        System.out.println("The red circle is centred at " + redX + ", " + redY);
        System.out.println("The blue circle is centred at " + blueX + ", " + blueY);
        System.out.println("The x co-ordinate for the two circles differs by " + Math.abs(redX - blueX));
        System.out.println("The y co-ordinate for the two circles differs by " + Math.abs(redY - blueY));
        System.out.println("The distance between the centre of the two circles is approximately " + (int)dis + " pixels.");
    }
}
