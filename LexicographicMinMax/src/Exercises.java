public class Exercises {
    /* this method prints the smallest character in str
    precondition: str.length() >= 1
    precondition: str contains only uppercase letters and no other characters
    constraint: maximise efficiency by ending the loop if an "A" is found,
    since no smaller character is possible
    */
    public static void printSmallest(String str) {
        // todo
        String min = "Z";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).compareTo(min) < 0) {
                min = str.substring(i, i + 1);
            }
            if (min.equals("A")) {
                break;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        // todo - test
        printSmallest("PROBLEMS");
        printSmallest("HELLO");
        printSmallest("ABSTRACT");
    }
}
