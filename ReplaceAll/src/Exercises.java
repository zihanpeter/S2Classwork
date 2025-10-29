public class Exercises {
    /* note: String methods like replace and replaceAll are banned! */

    /* return a string with all instances of "a" replaced with "b" */
    public static String replaceAwithB(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("a")) {
                res += "b";
            }
            else {
                res += str.substring(i, i + 1);
            }
        }
        return res;
    }

    /* return a string with all instances of corrupt replaced with "?"
    e.g. replaceCorruptWithQ("pAAAotatoes AAAare deliAAAcioAAAus", "AAA") returns "p?otatoes ?are deli?cio?us" */
    public static String replaceCorruptWithQ(String in, String corrupt) {
        String res = "";
        int index = in.indexOf(corrupt);
        while (index != -1) {
            res += in.substring(0, index) + "?";
            in = in.substring(index + corrupt.length());
            index = in.indexOf(corrupt);
        }
        res += in;
        return res;
    }

    public static void main(String[] args) {
        // todo - test data
        System.out.println(replaceAwithB("Hello"));
        System.out.println(replaceAwithB("pizza"));
        System.out.println(replaceAwithB("Star Star Absolute"));

        System.out.println(replaceCorruptWithQ("pAAAotatoes AAAare deliAAAcioAAAus", "AAA"));
        System.out.println(replaceCorruptWithQ("Hellooo prooo cool", "ooo"));
        System.out.println(replaceCorruptWithQ("print ink integer", "int"));
    }
}
