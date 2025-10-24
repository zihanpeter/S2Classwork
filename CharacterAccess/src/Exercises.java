public class Exercises {
    /*
    this method prints every character in phrase backwards
    e.g. reverse("abcdef") prints "fedcba"
    */
    public static void reverse(String phrase) {
        // todo
        String res = "";
        for (int i = phrase.length() - 1; i >= 0; i--) {
            res += phrase.substring(i, i + 1);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        // test data - todo
        reverse("hello");
        reverse("print");
    }

}
