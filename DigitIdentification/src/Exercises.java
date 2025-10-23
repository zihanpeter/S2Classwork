public class Exercises {
    /* return true if the sum of digits in value add up to a number that is
  divisible by seven
  precondition: value > 0 */
    public static boolean digitSumDivBy7(int value) {
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum % 7 == 0;
    }

    /* return the product of all digits in num
  ignoring zeroes and nines
  precondition: num > 0 */
    public static int findProd(int num) {
        int product = 1;
        while (num > 0) {
            if (num % 10 != 9 && num % 10 != 0) {
                product *= num % 10;
            }
            num /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        /* todo: test data */
        System.out.println(digitSumDivBy7(17));
        System.out.println(digitSumDivBy7(77));

        System.out.println(findProd(18));
        System.out.println(findProd(209));
        System.out.println(findProd(30));
        System.out.println(findProd(19));
    }
}
