public class Examples {
    /* counts the number of times "A" or "B" is included in strIn */
    public static int countAB(String strIn) {
        int count = 0;
        for (int i = 0; i < strIn.length(); i++) {
            String nextChar = strIn.substring(i, i+1);
            if (nextChar.equals("A") || nextChar.equals("B")) {
                count++;
            }
        }
        return count;
    }

    /*
    if "delve" appears at least 5 times in passage, return true
    otherwise return false
    */
    public static boolean basicAIChecker(String passage) {
        int count = 0;
        for (int i = 0; i < passage.length() - 4; i++) {
            if (passage.substring(i, i + 5).equals("delve")) count++;
        }
        return count >= 5;
    }

    /* count the number of times target appears in phrase */
    public static int countInstancesOf(String target, String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length() - target.length() + 1; i++) {
            if (phrase.substring(i, i + target.length()).equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = countAB("AXXXBXXAABBABABYYZ"); // expected: 10
        int result2 = countAB("AB"); // expected: 2
        int result3 = countAB(""); // expected: 0

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        boolean result4 = basicAIChecker("delve delve abcdef delve delv e xyz delve delve del"); // expected: true
        boolean result5 = basicAIChecker("delving d d d delve delve delv yyy delve"); // expected: false

        System.out.println(result4);
        System.out.println(result5);

        int result6 = countInstancesOf("at", "cats concatenated with cats equals catscats"); // expected: 6
        int result7 = countInstancesOf("aaa", "aaaaaa"); // expected: 4

        System.out.println(result6);
        System.out.println(result7);
    }

}
