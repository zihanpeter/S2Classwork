import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*
Modify:
-Decrease the number of allowed login attempts from 5 to 3
-Refactor validateCredentials so that the body is a single line of code
-Display the number of attempts remaining before the user makes a login attempt instead of after

-add a method of type String named generateCaptcha which returns a randomly generated string of 6 numerical digits (0-9).
this method should use a loop to build the string.

-add a method of type String named getCaptcha which prompts the user to input a captcha. The body should be similar
to the pre-existing getUsername and getPassword methods

-After completing the above, modify the main method as follows:
•	Generate a captcha and display it to the user at the beginning of the method, before any looping.
•	Require the user to also type in the captcha in addition to the username and password.
•	If the captcha is skipped or incorrect, do not count it as an attempt – do not validate the credentials
   or subtract an attempt from the counter.
   Instead, output a suitable message (e.g. please complete the captcha) and prompt the user to re-enter the captcha.
   Once the captcha is entered correctly, validate the username and password.
•	A new captcha should be generated for each login attempt. In other words, once a captcha has been correctly input,
it should be regenerated for the next username/password input if needed.
 */

public class Login {
    public static boolean validateCredentials(String username, String password) {
        return username.equals("Admin") && password.equals("badpassword");
    }

    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        return scanner.nextLine();
    }

    public static String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        return scanner.nextLine();
    }

    public static String getCaptcha() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter captcha: ");
        return scanner.nextLine();
    }

    public static String generateCaptcha() {
        String result = "";
        int count = 1;
        while (count <= 6) {
            int num = (int)(Math.random() * 10);
            result += num;
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        int attemptsRemaining = 3;
        boolean credentialsValid = false;
        String generatedCaptcha = generateCaptcha();

        while (attemptsRemaining > 0 && !credentialsValid) {
            System.out.println("You have " + attemptsRemaining + " attempts remaining.");
            System.out.println("Captcha: " + generatedCaptcha);
            String enteredUsername = getUsername();
            String enteredPassword = getPassword();
            String enteredCaptcha = getCaptcha();
            if (enteredCaptcha.equals(generatedCaptcha)) {
                credentialsValid = validateCredentials(enteredUsername, enteredPassword);
                if (!credentialsValid) {
                    attemptsRemaining--;
                    System.out.println("Incorrect. Try again.");
                }
            }
            else {
                System.out.println("Please complete the captcha");
            }
            generatedCaptcha = generateCaptcha();
        }

        if (credentialsValid) {
            System.out.println("You have logged in successfully.");
        }
        else {
            System.out.println("You have exceeded the number of allowed logins. Try again later.");
        }
    }
}
