public class Exercises {
    /* this method returns true if the number of classes can be evenly
    distributed such that every teacher can teach the same number of classes
    and no classes are left over. */
    public static boolean canDistributeEvenly(int numClasses, int numTeachers) {
        return numClasses % numTeachers == 0;
    }

    /* a bike rental company charges 10 cents per minute to use a bicycle
    plus a $5 base fee every hour (round up to the nearest whole hour).
    Return the correct price based on the number of minutes provided
    e.g. 173 minutes = $17.30, plus 3x $5 fee = $32.30 */
    public static double calculatePrice(int numMinutes) {
        double ans = numMinutes * 0.1;
        if (numMinutes % 60 == 0) {
            ans += (double) (numMinutes / 60 * 5);
        }
        else {
            ans += (double) ((numMinutes / 60 + 1) * 5);
        }
        return ans;
    }

    public static void main(String[] args) {
        /* to do: test data */
        System.out.println(canDistributeEvenly(10, 5));
        System.out.println(canDistributeEvenly(10, 3));

        System.out.println(calculatePrice(173));
    }
}
