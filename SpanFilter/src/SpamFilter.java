import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class SpamFilter {
    private KeyWord[] keywords;
    private String[] emails;

    public SpamFilter() throws FileNotFoundException {
        keywords = new KeyWord[20];
        emails = new String[4];
        populateArrays();
    }

    public void populateArrays() throws FileNotFoundException {
        File file = new File("Emails.txt");
        Scanner scanner = new Scanner(file);

        String email = "";
        while (scanner.hasNextLine()) {
            email += scanner.nextLine() + "\n";
        }

        emails = email.split("---\n\n");

        file = new File("KeyWordWeightings.txt");
        scanner = new Scanner(file);

        String[] keyword = new String[2];
        for (int i = 0; i < 20; i++) {
            String temp = scanner.nextLine();
            keyword = temp.split(": ");
            keywords[i] = new KeyWord(keyword[0], Integer.parseInt(keyword[1]));
        }
    }

    private void classify(String email) {
        String newemail = new String(email);
        int score = 0;
        int index1 = email.indexOf(" ");
        int index2 = email.indexOf("\n");
        int index;
        if (index1 < index2) {
            index = index1;
        }
        else {
            index = index2;
        }
        while (index != -1) {
            String word = email.substring(0, index);
//            System.out.println(word);
            for (int i = 0; i < 20; i++) {
                if (word.toLowerCase().equals(keywords[i].getWord().toLowerCase())) {
                    score += keywords[i].getWeight();
                }
            }
            email = email.substring(index + 1);
            index1 = email.indexOf(" ");
            index2 = email.indexOf("\n");
            if (index1 < index2) {
                index = index1;
            }
            else {
                index = index2;
            }

        }
        System.out.print(newemail.substring(0, newemail.indexOf("\n")) + "... is ");
        if (score >= 7) {
            System.out.println("likely to be a span message");
        }
        else {
            System.out.println("unlikely to be a span message");
        }
        System.out.println("Score: " + score);
    }

    public void classifyAll() {
        for (int i = 0; i < 4; i++) {
            classify(emails[i]);
        }
    }

    static void main() throws FileNotFoundException {
        SpamFilter spamFilter = new SpamFilter();
        spamFilter.classifyAll();
    }
}
