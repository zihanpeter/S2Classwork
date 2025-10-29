public class Examples {
    /*
    returns a String that is the reverse of str
     */
    public static String reverse(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString = str.substring(i, i+1) + newString;
        }
        return newString;

        /*
        ALTERNATIVE VERSION - loop from back:
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString += str.substring(i, i+1);
        }
        return newString;
         */
    }

    /*
    determine if str is a palindrome
    a palindrome is a word that reads the same backwards
    and forwards, e.g. "racecar" reversed is also "racecar"
    precondition: all lowercase, only characters a-z
    */
    public static boolean isPalindrome(String str) {
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString += str.substring(i, i+1);
        }
        return str.equals(newString);
    }

    public static void main(String[] args) {
        String result1 = reverse("hello"); // expected: olleh
        String result2 = reverse("racecar"); // expected: racecar
        String result3 = reverse("what year is it?"); // expected: ?ti si raey tahw

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        boolean result4 = isPalindrome("racecar"); // expected: true
        boolean result5 = isPalindrome("x"); // expected: true
        boolean result6 = isPalindrome(""); // expected: true
        boolean result7 = isPalindrome("computer"); // expected: false

        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
    }
}
