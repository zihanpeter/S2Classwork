public class Examples {
    /* note: String methods like replace and replaceAll are banned! */

    /*
     return a String based on str
     with all instances of "cat" replaced with "dog"
    */
    public static String noMoreCats(String str) {
        String result = "";
        int index = str.indexOf("cat");
        while (index != -1) {
            result += str.substring(0, index) + "dog";
            str = str.substring(index + 3); // length of cat is 3
            index = str.indexOf("cat");
        }
        return result + str;
    }

    /* return a string with all instances of sub replaced with rep */
    public static String findReplace(String str, String sub, String rep) {
        String result = "";
        int index = str.indexOf(sub);
        while (index != -1) {
            result += str.substring(0, index) + rep;
            str = str.substring(index + sub.length());
            index = str.indexOf(sub);
        }
        return result + str;
    }

    public static void main(String[] args) {
        // expected: dogs condogenated with dogs equals dogsdogs
        String result1 = noMoreCats("cats concatenated with cats equals catscats");
        String result2 = noMoreCats("catdogcat"); // expected: dogdogdog
        String result3 = noMoreCats("rabbit abc dog ca dog"); // expected: rabbit abc dog ca dog

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // expected: computer science professionals do computer science all day. I love computer science!
        String result4 = findReplace("cs professionals do cs all day. I love cs!", "cs", "computer science");
        System.out.println(result4);
    }

}
