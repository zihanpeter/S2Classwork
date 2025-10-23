import java.util.Scanner;

public class Examples {
    /* count the number of zeroes in an int
    precondition: num > 0 */
    public static int countZeroes(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) count++;
            num /= 10;
        }
        return count;
    }

    /* user inputs 10 integers
    count the number of odd numbers input */
    public static int countOddInputs() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter a number: ");
            int nextNum = sc.nextInt();
            if (nextNum % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /* this method generates n random numbers and returns the count of
    how many were between a and b
     precondition: a and b are both in range [0.0, 1.0)
     precondition: a <= b
     precondition: n >= 1 */
    public static int countRandomInRange(int n, double a, double b) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            double random = Math.random();
            if (random >= a && random <= b) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = countZeroes(1842234); // expected: 0
        int result2 = countZeroes(1000001); // expected: 5
        int result3 = countZeroes(10101010); // expected: 4

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        //int result4 = countOddInputs(); // e.g. input 1 2 3 4 5 6 7 8 9 10 returns 5
        //System.out.println(result4);

        int result5 = countRandomInRange(10, 0.2, 0.9); // you would expect an average return of about 7
        System.out.println(result5);
    }
}
