public class Examples {
    /* this method calculates the sum of a number's individual digits
    e.g. 1724 => 14 (1 + 7 + 2 + 4)
    precondition: num > 0 */
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    /* return the number of digits in num
    note that num may initially be zero
    precondition: num >= 0 */
    public static int countDigits(int num) {
        if (num == 0) return 1;
        else {
            int count = 0;
            while (num > 0) {
                count++;
                num /= 10;
            }
            return count;
        }
    }



    /* this method returns true if all digits are in non-decreasing order
    e.g. 12569 ==> true, 17828 ==> false, 12227 ==> true
    precondition: num > 0*/
    public static boolean increasingDigits(int num) {
        int lastDigit = num % 10;
        num /= 10;
        while (num > 0) {
            int nextDigit = num % 10;
            if (nextDigit > lastDigit) return false;
            else num /= 10;
        }
        return true;
    }

    /*
    Some explanation on the above - since this method of solution goes through the number from right
    to-left, I flipped the way I am thinking about the problem - non-decreasing order left to right is the
    same as decreasing order right to left, which better matches the order I am accessing the digits.
     */

    /* this method returns a string that represents the number
    but skips all zeroes. e.g. 8012204 ==> "eight one two two four"
    precondition: num > 0*/
    public static String buildNumString(int num) {
        String numString = "";
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0) numString = getWordFromInt(digit) + " " + numString;
            num /= 10;
        }
        return numString;
    }

    /* helper method for buildNumString
    precondition: num >= 0 && num <= 9
    * returns the corresponding spelled out word for num
    * e.g. getWordFromInt(7) => "seven" */
    public static String getWordFromInt(int num) {
        if (num == 0) return "zero";
        if (num == 1) return "one";
        if (num == 2) return "two";
        if (num == 3) return "three";
        if (num == 4) return "four";
        if (num == 5) return "five";
        if (num == 6) return "six";
        if (num == 7) return "seven";
        if (num == 8) return "eight";
        return "nine";
    }

    public static void main(String[] args) {
        int result1 = digitSum(1724); // expected: 14
        int result2 = digitSum(703184); // expected: 23

        System.out.println(result1);
        System.out.println(result2);

        int result3 = countDigits(0); // expected: 1
        int result4 = countDigits(9); // expected: 1
        int result5 = countDigits(60820); // expected: 5

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        boolean result6 = increasingDigits(123); // expected: true
        boolean result7 = increasingDigits(8456); // expected: false
        boolean result8 = increasingDigits(8); // expected: true

        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);

        String result9 = buildNumString(8012204); // expected: eight one two two four
        String result10 = buildNumString(1234); // expected: one two three four
        String result11 = buildNumString(6); // expected: six

        System.out.println(result9);
        System.out.println(result10);
        System.out.println(result11);
    }
}
