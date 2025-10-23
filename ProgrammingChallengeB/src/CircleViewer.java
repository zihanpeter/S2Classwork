import javax.swing.*;
import java.awt.*;

/**
 * The CircleViewer class is responsible for rendering all Circle objects
 * on a GUI panel centered in the window.
 *
 * This class is not used directly by students except through launch().
 */
public class CircleViewer extends JPanel {

    private static final CircleViewer panel = new CircleViewer();

    /**
     * Launches the GUI window and displays all current circles.
     * Should be called once at the start of the student's main method.
     */
    public static void launch() {
        JFrame frame = new JFrame("Circle Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); // center on screen
        frame.add(panel);
        frame.setVisible(true);
    }

    /**
     * Redraws the panel to reflect updated circle positions or styles.
     * Called automatically by Circle methods.
     */
    public static void refresh() {
        panel.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Circle c : Circle.getAllCircles()) {
            g.setColor(c.getColor());
            int x = getWidth() / 2 + c.getX() - c.getRadius();
            int y = getHeight() / 2 - c.getY() - c.getRadius(); // y-axis up
            int d = 2 * c.getRadius();
            g.fillOval(x, y, d, d);
        }
    }
}
