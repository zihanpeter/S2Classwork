import java.util.Scanner;

public class SortedNames {
    public static void main(String[] args) {
        System.out.println("Please input three names: ");
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();

        if (name1.compareTo(name2) > 0) {
            String temp = name1;
            name1 = name2;
            name2 = temp;
        }

        if (name2.compareTo(name3) > 0) {
            String temp = name2;
            name2 = name3;
            name3 = temp;
        }

        if (name1.compareTo(name2) > 0) {
            String temp = name1;
            name1 = name2;
            name2 = temp;
        }

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
