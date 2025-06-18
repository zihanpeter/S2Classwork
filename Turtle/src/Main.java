import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World myWorld = new World(600,600);

    Turtle firstTurtle = new Turtle(myWorld);
    Turtle secondTurtle = new Turtle(myWorld);
    Turtle thirdTurtle = new Turtle(myWorld);

    firstTurtle.setColor(Color.blue);
    firstTurtle.forward();
    firstTurtle.turnRight();
    firstTurtle.forward();

    secondTurtle.setColor(Color.pink);
    secondTurtle.turnRight();
    secondTurtle.forward();
    secondTurtle.forward();
    secondTurtle.turnLeft();
    secondTurtle.forward();
    secondTurtle.forward();
    secondTurtle.turnLeft();
    secondTurtle.forward();

    thirdTurtle.setColor(Color.red);
    thirdTurtle.backward();
    thirdTurtle.turnLeft();
    thirdTurtle.forward();
    thirdTurtle.turnLeft();
    thirdTurtle.forward();

    myWorld.setVisible(true);
  }
}
