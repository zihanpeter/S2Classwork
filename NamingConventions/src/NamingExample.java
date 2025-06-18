public class NamingExample {
    /* to do
    this program works okay, but some of the variable names are unconventional.
    correct them to follow Java conventions.
    */
    public static void main(String[] args) {

        int userAge = 25;
        String fullName = "John Doe";
        boolean isValid = true;
        double accBalance = 99.99;
        String preferLang = "Java";

        if (userAge > 18) {
            System.out.println(fullName + " is an adult");
        }

        if (isValid && accBalance > 50.0) {
            System.out.println("Account is active");
        }

        if (preferLang.equals("Python")) {
            System.out.println("Wrong language preference");
        } else {
            System.out.println("We're using " + preferLang);
        }
    }
}
