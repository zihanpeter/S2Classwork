import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        String sentence1 = "The ";
        String sentence2 = " wizard decided to ";
        String sentence3 = " with his pet ";
        String sentence4 = " during the festival.";
        String adj;
        String noun;
        String verb;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        adj = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun = scanner.nextLine();

        System.out.println(sentence1 + adj + sentence2 + noun + sentence3 + verb + sentence4);
    }
}
