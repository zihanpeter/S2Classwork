public class Exercises {

    /* this method simulates four rolls of a six-sided dice
    output the result of each roll
    output the sum of all four rolls at the end
    if the user rolls more than 18, output the word "bonus" */
    public static void diceRoll() {
        /* to do */
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            int roll = (int) (Math.random() * 6) + 1;
            System.out.println(roll);
            sum += roll;
        }
        System.out.println(sum);
        if (sum > 18) {
            System.out.println("bonus");
        }
    }

    /* this method calculates total sales for a day
    the parameter tells us the number of orders
    for each order, call the helper method and pass in the numerical
    order number (starting from 1)
    for example, to get the total from the 7th order,
    do getOrderTotal(7) which will return a double such
    as 84.56 to be added to the overall total */
    public static double calculateTotalSales(int numOrders) {
        double total = 0.0;
        for (int i = 1; i <= numOrders; i++) {
            total += getOrderTotal(i);
        }
        return total;
    }

    public static void main(String[] args) {
        /* todo: test data */
        diceRoll();
        diceRoll();

        System.out.println(calculateTotalSales(5));
        System.out.println(calculateTotalSales(7));
    }

    /* helper method: returns the total value of a given order */
    public static double getOrderTotal(int orderNo) {
        return ((int) (Math.random() * 20000) / 100.0) * (orderNo % 4);
    }
}
