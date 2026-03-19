import java.util.Arrays;

public class VendingMachine {
    private String[][] snacks;

    public VendingMachine() {
        snacks = new String[4][3];

        snacks[0][0] = "Chips";
        snacks[0][1] = "Chocolate";
        snacks[0][2] = "Cookies";

        snacks[1][0] = "Popcorn";
        snacks[1][1] = "Pretzels";
        snacks[1][2] = "Granola Bar";

        snacks[2][0] = "Apple";
        snacks[2][1] = "Banana";
        snacks[2][2] = "Orange";

        snacks[3][0] = "Yogurt";
        snacks[3][1] = "Nuts";
        snacks[3][2] = "Crackers";
    }

    // todo: print snack names using indexed for row-major traversal
    public void showSnacksByRow() {
        for (int row = 0; row < snacks.length; row++) {
            for (int col = 0; col < snacks[0].length; col++) {
                System.out.println(snacks[row][col]);
            }
        }
    }

    // todo: print snack names using column-major traversal
    public void showSnacksByCol() {
        for (int col = 0; col < snacks[0].length; col++) {
             for (int row = 0; row < snacks.length; row++) {
                System.out.println(snacks[row][col]);
            }
        }
    }

    // todo: print snack names using snake traversal starting from bottom right, going right to left
    public void snakeSnacks() {
        for (int row = snacks.length - 1; row >= 0; row--) {
            if (row % 2 == 1) {
                for (int col = snacks[0].length - 1; col >= 0; col--) {
                    System.out.println(snacks[row][col]);
                }
            }
            else {
                for (int col = 0; col < snacks[0].length; col++) {
                    System.out.println(snacks[row][col]);
                }
            }
        }
    }

    // todo: return the name of the snack with the longest name using enhanced for
    public String longestName() {
        String res = "";
        for (String[] row : snacks) {
            for (String snack : row) {
                if (snack.length() > res.length()) {
                    res = snack;
                }
            }
        }
        return res;
    }

    public String[][] getSnacks() {
        return snacks;
    }

    public static void main(String[] args) {
        VendingMachine v = new VendingMachine();
        // shows typical structure
        System.out.println(Arrays.toString(v.getSnacks()[0]));
        System.out.println(Arrays.toString(v.getSnacks()[1]));
        System.out.println(Arrays.toString(v.getSnacks()[2]));
        System.out.println(Arrays.toString(v.getSnacks()[3]));

        v.showSnacksByRow();
        System.out.println();
        v.showSnacksByCol();
        System.out.println();
        v.snakeSnacks();
        System.out.println();
        System.out.println(v.longestName());
    }
}
