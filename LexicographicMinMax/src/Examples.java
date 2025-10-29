public class Examples {
    /* return the alphabetically largest character in buffer
  precondition: buffer.length() >= 1
  precondition: buffer contains only characters a-z (lowercase)
  */
    public static String largestCharacter(String buffer) {
        String max = buffer.substring(0, 1);
        for (int i = 1; i < buffer.length(); i++) {
            if (buffer.substring(i, i+1).compareTo(max) > 0) {
                max = buffer.substring(i, i+1);
            }
        }
        return max;
    }

    /* return the alphabetically largest letter in buffer
  precondition: buffer.length() >= 1
  buffer may contain any type of characters, but everything non-alphabetic
  should be ignored. Assume buffer contains at least one alphabetic character.
  lowercase and uppercase are treated equally, and the returned character
  is always uppercase. */
    public static String findLargest(String buffer) {
        String max = "A"; // can't assume the first character in buffer is alpha
        buffer = buffer.toUpperCase(); // ignore case
        for (int i = 0; i < buffer.length(); i++) {
            String nextChar = buffer.substring(i, i+1);
            if (isAlpha(nextChar)) { // call helper method that I defined
                if (nextChar.compareTo(max) > 0) {
                    max = nextChar;
                }
            }
        }
        return max;
    }
    // helper method
    public static boolean isAlpha(String chr) {
        chr = chr.toUpperCase();
        return chr.compareTo("A") >= 0 && chr.compareTo("Z") <= 0;
    }

    public static void main(String[] args) {
        String result1 = largestCharacter("ajtewqrbcck"); // expected: w
        String result2 = largestCharacter("zyxazyx"); // expected: z
        String result3 = largestCharacter("a"); // expected: a

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        String result4 = findLargest("k!oLp @y0R"); // expected: Y
        String result5 = findLargest("_!?O%.hI..pbf"); // expected: P

        System.out.println(result4);
        System.out.println(result5);
    }
}
