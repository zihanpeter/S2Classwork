public class Exercises {
    /* Return a string that is equal to str
    but with all non-alphabetic characters removed
    all characters converted to upper case
    and all characters in reverse
    e.g. "unit 1.1 quiz" --> "ZIUQTINU"*/
    public static String messyString(String str) {
        str = str.toUpperCase();
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            String nowChar = str.substring(i, i + 1);
            if (nowChar.compareTo("A") >= 0 && nowChar.compareTo("Z") <= 0) {
                res += nowChar;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // todo - test data
        System.out.println(messyString("unit 2.3!"));
        System.out.println(messyString("hello HELLO !@#"));
        System.out.println(messyString("User_9608 Welcome!"));
    }
}
