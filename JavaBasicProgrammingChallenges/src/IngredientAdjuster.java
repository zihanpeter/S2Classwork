import java.util.Scanner;

public class IngredientAdjuster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cookies;
        double sugar;
        double butter;
        double flour;

        System.out.println("How many cookies are you making?");

        cookies = scanner.nextInt();

        sugar = 1.5 / 48 * cookies;
        butter =  1.0 / 48 * cookies;
        flour = 2.75 / 48 * cookies;

        System.out.println(sugar + " cups of sugar.");
        System.out.println(butter + " cups of butter.");
        System.out.println(flour + " cups of flour.");
    }
}
