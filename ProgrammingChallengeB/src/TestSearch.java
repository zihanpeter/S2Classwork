import java.util.Scanner;

public class TestSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence;
        String keyword1;
        String keyword2;

        System.out.print("Enter a sentence: ");
        sentence = scanner.nextLine();
        System.out.print("Enter first keyword to search for: ");
        keyword1 = scanner.nextLine();
        System.out.print("Enter second keyword to search for: ");
        keyword2 = scanner.nextLine();

        System.out.println("'" + keyword1 + "' first appears at index: " + sentence.indexOf(keyword1));
        System.out.println("'" + keyword2 + "' first appears at index: " + sentence.indexOf(keyword2));
        System.out.println("Lexicographic compare (" + keyword1 + " vs " + keyword2 + "): " + keyword1.compareTo(keyword2));
    }
}
