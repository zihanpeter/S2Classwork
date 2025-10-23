
/*
modify:

-Make the last number output by the method 1 instead of 0.
-Add a … after each number so that it prints:
    10…
    9…
    8…
    And so on.
-Modify the method to take a parameter that defines the starting point for the countdown.
For example, if the method is called as happyNewYear(7), the countdown starts at 7.
-Modify the method to take another parameter that defines the message that is printed when the countdown ends.
It would be sensible to rename the method to something more generic.

 */
public class HappyNewYear {
    public static void happyNewYear(int start, String msg) {
        for (int i = start; i >= 1; i--) {
            System.out.println("" + i + "...");
            pause();
        }
        System.out.println(msg);
    }

    // this method will pause the program for 1 second when called
    private static void pause() {
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println("Something went wrong. ");
        }
    }

    public static void main(String[] args) {
        happyNewYear(7, "Happy new year");
    }
}
