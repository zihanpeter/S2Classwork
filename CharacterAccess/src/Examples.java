public class Examples {
    /* this method prints every character in the parameter phrase */
    public static void printAll(String phrase) {
        for (int i = 0; i < phrase.length(); i++) {
            System.out.println(phrase.substring(i, i+1));
        }
    }



    public static void main(String[] args) {
        printAll("hello world");
    }
}
