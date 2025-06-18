public class RandomMathFacts {
    public static void main(String[] args) {

        /* modifications
        the first random int should now be in range [5, 40]
        the random exponent should be in range [2, 7]
        output the square root of num^exp
        generate two random numbers in range [0, 1)
        output them and the difference between them (as a non-neg)
         */
        int num = (int)(Math.random() * 36) + 5; // 1. tweak range to [5, 40]
        System.out.println("Random number: " + num);
        System.out.println("Square root: " + Math.sqrt(num));
        int exp = (int)(Math.random() * 6) + 2; // 2. tweak range to [2, 7]
        System.out.println("Random exponent: " + exp);
        System.out.println(num + "^" + exp + ": " + Math.pow(num, exp));

        // 3. calculate and output the square root of num^exp
        System.out.println("Square root of " + num + "^" + exp + ": "+ Math.sqrt(Math.pow(num, exp)));
        // 4. generate two random doubles in range [0, 1)
        double randomNum1 = Math.random();
        double randomNum2 = Math.random();
        // 5. calculate the difference in their magnitudes (as a non-neg)
        double diff = Math.abs(randomNum1 - randomNum2);
        // 6. output the calculated difference
        System.out.println("The difference between " + randomNum1 + " and " + randomNum2 + ": " + diff);
    }
}
