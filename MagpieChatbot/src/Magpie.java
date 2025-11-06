import java.time.LocalDate;
import java.util.Scanner;

public class Magpie
{
    private String pattern = "few";
    private String name = "";

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        int whichResponse = (int) (Math.random() * NUMBER_OF_RESPONSES);
        String response = "";

        if (pattern.equals("few")) {
            if (whichResponse == 0)
            {
                response = "Interesting.";
            }
            else if (whichResponse == 1)
            {

                response = "Okay.";
            }
            else if (whichResponse == 2)
            {
                response = "I haven't heard that before.";
            }
            else if (whichResponse == 3)
            {
                response = "What else could you tell me about that?";
            }
            else if (whichResponse == 4)
            {
                response = "That's good.";
            }
            else if (whichResponse == 5)
            {
                response = "Great.";
            }
        }
        else {
            if (whichResponse == 0)
            {
                response = "Interesting.\nThat's so great.";
            }
            else if (whichResponse == 1)
            {

                response = "Okay.\nTell me more.";
            }
            else if (whichResponse == 2)
            {
                response = "I haven't heard that before.\nCan you tell me something else?";
            }
            else if (whichResponse == 3)
            {
                response = "What else could you tell me about that?\nPlease tell me something interesting.";
            }
            else if (whichResponse == 4)
            {
                response = "That's good.\nKeep going.";
            }
            else if (whichResponse == 5)
            {
                response = "Great.\nTell me more about that.";
            }
        }
        return response;
    }

    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk. Type in \"Bye\" to end our chat.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        response = transformResponse(statement);
        if (response == null)
        {
            response = keywordResponse(statement);
            if (response == null)
            {
                response = getRandomResponse();
            }
        }
        return response;
    }

    private String keywordResponse(String statement)
    {
        if (statement.indexOf("food") != -1)
        {
            if (pattern == "few") return "Let's eat something.";
            return "Let's eat something.\nFor example, let's eat some pizza.";
        }
        if (statement.indexOf("sport") != -1)
        {
            if (pattern == "few") return "I like doing sports.";
            return "I know a lot of sports.\nI like playing basketball the most.";
        }
        if (statement.indexOf("date") != -1)
        {
            return LocalDate.now().toString();
        }
        return null;
    }

    private String pureText(String statement)
    {
        String res = "";
        for (int i = 0; i < statement.length(); i++)
        {
            String now = statement.substring(i, i + 1);
            if (!now.equals("?") && !now.equals(".") && !now.equals(";"))
            {
                res += now;
            }
        }
        return res;
    }

    private String transformResponse(String statement)
    {
        statement = pureText(statement);

        if (statement.indexOf("I want") != -1)
        {
            return statement + " too!";
        }
        if (statement.indexOf("Would you like ") != -1)
        {
            String something = statement.substring(15);
            int ansNum = (int) (Math.random() * 3);
            String ans;
            if (ansNum == 0)
            {
                ans = "Yes, I would like " + something;
            }
            else if (ansNum == 1)
            {
                ans = "No thank you, I don't want " + something;
            }
            else
            {
                ans = "I am not sure. Tell me more about " + something;
            }
            return ans;
        }
        if (statement.indexOf("Are you ") != -1)
        {
            String something = statement.substring(8);
            int ansNum = (int) (Math.random() * 2);
            String ans;
            if (ansNum == 0)
            {
                ans = "Yes, I am " + something;
            }
            else
            {
                ans = "No, I am not " + something;
            }
            return ans;
        }
        if (statement.indexOf("My name is ") != -1)
        {
            name = statement.substring(11);
            return "Yes, I got your name.";
        }
        if (statement.indexOf("What is") != -1 && statement.indexOf("name") != -1)
        {
            return "Your name is " + name;
        }
        if (statement.indexOf("game") != -1 && (statement.indexOf("Play") != -1 || statement.indexOf("play") != -1))
        {
            Scanner scanner = new Scanner(System.in);
            int ans = (int) (Math.random() * 100) + 1;
            System.out.println("Guess a number in [1, 100]: ");
            int input = scanner.nextInt();
            while (input != ans) {
                if (input < ans) System.out.println("Too small");
                else System.out.println("Too big");
                System.out.println("Continue guessing: ");
                input = scanner.nextInt();
            }
            return "Well done! The number is " + ans + "\nLet's continue talking.";
        }
        if (statement.indexOf("Give me more answer") != -1)
        {
            pattern = "more";
            return "Sure, I will begin to produce more responses.";
        }
        if (statement.indexOf("Give me fewer answer") != -1)
        {
            pattern = "few";
            return "Ok, I will produce shorter answers.";
        }
        return null;
    }
}