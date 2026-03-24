/*
This task involves a path through a 2D array where the path is based on the values of the elements in the array.
 */

public class GridPath {
    private int[][] grid;

    public GridPath() {
        grid = new int[][]{{12,3,4,13,5},{11,21,2,14,16}, {7,8,9,15,0}, {10,17,20,19,1},{18,22,30,25,6}};
    }

    /*
    returns the Location representing a neighbor of the grid element at row and col,
    as described below.

    preconditions: row, col does not reference the element in the bottom-right corner of grid.
                   row, col is an otherwise valid index of grid

    Return a location object that represents the smaller of two neighbours of the grid
    element at row and col, according to the following rules:
    - the two neighbors that are considered are the element below the given element, and the
    element to the right of the given element, if they exist.
    - if both neighbours exist, the Location of the neighbour with the smaller value is returned.
    Two neighbours will always have different values.
    - if only one neighbour exists, the Location of the existing neighbour is returned
    - as a precondition, the parameters will not reference the element in the bottom right corner of grid
    i.e., it is guaranteed that one or two neighbours exist
     */
    public Location getNextLoc(int row, int col) {
        if (row == grid.length - 1) {
            return new Location(row, col + 1);
        }
        if (col == grid[0].length - 1) {
            return new Location(row + 1, col);
        }
        if (grid[row + 1][col] < grid[row][col + 1]) {
            return new Location(row + 1, col);
        }
        return new Location(row, col + 1);
    }

    /*
    Computes and returns the sum of all values on a path throughout the grid, as described below.

    preconditions: row is a valid row index and col is a valid column index in grid
                   row and col do not specify the element in the bottom right corner of grid

    The path begins with the element at row and col and is determined by successive calls to getNextLoc.
    The path ends when the element in the last row and the last column of grid is reached.

    You must call getNextLoc correctly as part of your solution.
     */
    public int sumPath(int row, int col) {
        int res = grid[row][col];
        while (row != grid.length - 1 || col != grid[0].length - 1) {
            Location nextLocation = getNextLoc(row, col);
            row = nextLocation.getRow();
            col = nextLocation.getCol();
            res += grid[row][col];
        }
        return res;
    }

    public void showGrid() {
        for (int[] row : grid) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GridPath gridPath = new GridPath();
        gridPath.showGrid();

        System.out.println("expected R=0,C=4, actual=" + gridPath.getNextLoc(0, 3));
        System.out.println("expected R=4,C=1, actual=" + gridPath.getNextLoc(4, 0));
        System.out.println("expected R=2, C=4, actual=" + gridPath.getNextLoc(2, 3));

        System.out.println("expected path sum: 54, actual=" + gridPath.sumPath(1, 1));
        System.out.println("expected path sum: 46, actual=" + gridPath.sumPath(2, 0));
        System.out.println("expected path sum: 41, actual=" + gridPath.sumPath(0, 3));
    }
}
