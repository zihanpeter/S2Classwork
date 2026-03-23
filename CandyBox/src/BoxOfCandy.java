
/*
This class represents a box of candy. You will write two methods in this class.
 */
public class BoxOfCandy {
    private Candy[][] box;


    public BoxOfCandy() {
        box = new Candy[3][5];
        box[0][0] = new Candy("lime");
        box[0][3] = new Candy("lemon");
        box[1][0] = new Candy("orange");
        box[1][3] = new Candy("lime");
        box[1][4] = new Candy("lime");
        box[2][0] = new Candy("cherry");
        box[2][2] = new Candy("lemon");
        box[2][4] = new Candy("orange");
    }

    /*
    todo:
    moves one piece of candy in column col, if necessary and possible, so that the box
    element in row 0 of column col contains a piece of candy, as described below.

    if the element at row 0 column col already contains a piece of candy, then box
    is unchanged and the method returns true.
    if the element at row 0 column col does not contain a piece of candy, then the
    method searches the remaining rows of column col for a piece of candy. if a piece
    of candy can be found in column col, it is moved to row 0, its previous location is set
    to null, and the method returns true. otherwise, the method returns false.

    Returns false if there is no piece of candy in column col and returns true otherwise.
    Precondition: col is a valid column index in box.
                  box is not null
     */
    public boolean moveCandyToFirstRow(int col) {
        Candy firstNotNull = null;
        for (int row = 0; row < box.length; row++) {
            if (box[row][col] != null && firstNotNull == null) {
                firstNotNull = box[row][col];
            }
        }
        box[0][col] = firstNotNull;
        return box[0][col] != null;
    }

    /*
    removes from box and returns a piece of candy with flavor specified by the parameter, or
    returns null if no such piece is found.

    the piece of candy removed and returned must be the first one encountered when traversing box as follows:
    - row-major traversal starting with the bottom/last row
    - every row is traversed from left to right
     */
    public Candy removeNextByFlavor(String flavor) {
        for (int row = box.length - 1; row >= 0; row--) {
            for (int col = 0; col < box[0].length; col++) {
                if (box[row][col] != null && box[row][col].getFlavor().equals(flavor)) {
                    Candy res = box[row][col];
                    box[row][col] = null;
                    return res;
                }
            }
        }
        return null;
    }

    public void showBoxContents() {
        for (Candy[] row : box) {
            for (Candy candy : row) {
                System.out.printf("%-20s", candy);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BoxOfCandy candyBox = new BoxOfCandy();
        candyBox.showBoxContents();
        System.out.println();
        boolean a = candyBox.moveCandyToFirstRow(2);
        candyBox.showBoxContents();
        System.out.println("expected true, actual=" + a);
        System.out.println("visually inspect the 2D array to confirm the operation was successful.");
        System.out.println();

        boolean b = candyBox.moveCandyToFirstRow(1);
        candyBox.showBoxContents();
        System.out.println("expected false, actual=" + b);
        System.out.println("visually inspect the 2D array to confirm the operation was successful.");
        System.out.println();

        boolean c = candyBox.moveCandyToFirstRow(4);
        candyBox.showBoxContents();
        System.out.println("expected true, actual=" + c);
        System.out.println("visually inspect the 2D array to confirm the operation was successful.");
        System.out.println();

        // ----------------- testing for part B

        Candy d = candyBox.removeNextByFlavor("orange");
        candyBox.showBoxContents();
        System.out.println("expected orange, actual=" + d);
        System.out.println("visually inspect the 2D array to confirm the operation was successful.");
        System.out.println();

        Candy e = candyBox.removeNextByFlavor("lemon");
        candyBox.showBoxContents();
        System.out.println("expected lemon, actual=" + e);
        System.out.println("visually inspect the 2D array to confirm the operation was successful.");
        System.out.println();

        Candy f = candyBox.removeNextByFlavor("grape");
        candyBox.showBoxContents();
        System.out.println("expected null, actual=" + f);
        System.out.println("visually inspect the 2D array to confirm the operation was successful.");
    }
}
