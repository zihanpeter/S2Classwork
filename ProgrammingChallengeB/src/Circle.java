import java.awt.*;
import java.util.ArrayList;

/**
 * The Circle class represents a drawable circle on a logical 2D plane.
 * All circles are automatically displayed in a GUI and tracked globally.
 *
 * Features:
 * - Optional radius and color on construction
 * - Default center at (0, 0)
 * - Static counter for total circles
 * - Methods to change position, color, and size
 */
public class Circle {

    private static int count = 0;
    private static final ArrayList<Circle> allCircles = new ArrayList<>();

    private int x = 0;
    private int y = 0;
    private int radius = 40;
    private Color color = Color.BLUE;

    /**
     * Constructs a circle with default radius and color.
     * Automatically added to the display and counted.
     */
    public Circle() {
        allCircles.add(this);
        count++;
        CircleViewer.refresh();
    }

    /**
     * Constructs a circle with custom radius and color.
     * @param radius radius of the circle in pixels
     * @param color color of the circle
     */
    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
        allCircles.add(this);
        count++;
        CircleViewer.refresh();
    }

    /**
     * Moves the center of the circle to (x, y).
     * @param x horizontal offset from center (positive is right)
     * @param y vertical offset from center (positive is up)
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
        CircleViewer.refresh();
    }

    /**
     * Sets the color of the circle.
     * @param color the new color
     */
    public void setColor(Color color) {
        this.color = color;
        CircleViewer.refresh();
    }

    /**
     * Sets the radius (size) of the circle.
     * @param radius new radius in pixels
     */
    public void setSize(int radius) {
        this.radius = radius;
        CircleViewer.refresh();
    }

    /**
     * Returns the number of Circle objects created.
     * @return total circle count
     */
    public static int countCircles() {
        return count;
    }

    /**
     * Returns the x-coordinate of the circle's center.
     *
     * @return the x-coordinate
     */
    public int getX() { return x; }

    /**
     * Returns the y-coordinate of the circle's center.
     *
     * @return the y-coordinate
     */
    public int getY() { return y; }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius
     */
    public int getRadius() { return radius; }

    /**
     * Returns the color of the circle.
     *
     * @return the color
     */
    public Color getColor() { return color; }


    static ArrayList<Circle> getAllCircles() {
        return allCircles;
    }
}
