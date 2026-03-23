public class ExperimentalFarm {
    /* may contain null values! */
    private Plot[][] farmPlots;

    public ExperimentalFarm() {
        farmPlots = new Plot[5][4];

        farmPlots[0][0] = new Plot("corn", 20);
        farmPlots[0][1] = new Plot("corn", 30);
        farmPlots[0][2] = new Plot("peas", 10);

        farmPlots[1][0] = new Plot("peas", 30);
        farmPlots[1][2] = new Plot("corn", 62);

        farmPlots[2][0] = new Plot("wheat", 10);
        farmPlots[2][1] = new Plot("corn", 50);
        farmPlots[2][2] = new Plot("rice", 30);

        farmPlots[3][0] = new Plot("corn", 55);
        farmPlots[3][1] = new Plot("corn", 30);
        farmPlots[3][2] = new Plot("peas", 30);

        farmPlots[4][0] = new Plot("wheat", 20);
        farmPlots[4][3] = new Plot("rice", 30);
    }

    /*
    returns the plot with the highest yield for the given crop type c
    if multiple plots have the highest yield, any of these plots may be returned
    if no plot exists with the specified yield, return null
    */
    public Plot getHighestYield(String c) {
        Plot res = null;
        int highestYield = 0;
        for (Plot[] row : farmPlots) {
            for (Plot plot : row) {
                if (plot != null && plot.getCropType().equals(c) && plot.getCropYield() > highestYield) {
                    highestYield = plot.getCropYield();
                    res = plot;
                }
            }
        }
        return res;
    }

    /*
    precondition: 0 <= col <= index of last column

    returns true if all plots in a given column of farmPlots contain the same crop
    if a column contains null values, but all non-null values are the same crop, return true
    if a column contains all null values, return true
    return false if none of the above apply
     */
    public boolean sameCrop(int col) {
        for (int row = 0; row < farmPlots.length - 1; row++) {
            if (farmPlots[row][col] != null && farmPlots[row + 1][col] != null) {
                if (!farmPlots[row][col].getCropType().equals(farmPlots[row + 1][col].getCropType())) {
                    return false;
                }
            }
        }
        return true;
    }

    public void showFarmPlots() {
        for (Plot[] row : farmPlots) {
            for (Plot plot : row) {
                System.out.printf("%-30s", plot);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ExperimentalFarm ex = new ExperimentalFarm();
        ex.showFarmPlots();

        System.out.println("peas expected 30, actual=" + ex.getHighestYield("peas"));
        System.out.println("wheat expected 20, actual=" + ex.getHighestYield("wheat"));
        System.out.println("corn expected 62, actual=" + ex.getHighestYield("corn"));
        System.out.println("bananas expected null, actual=" + ex.getHighestYield("bananas"));

        System.out.println("expected false, actual="+ex.sameCrop(0));
        System.out.println("expected true, actual="+ex.sameCrop(1));
        System.out.println("expected false, actual="+ex.sameCrop(2));
        System.out.println("expected true, actual="+ex.sameCrop(3));
    }
}
