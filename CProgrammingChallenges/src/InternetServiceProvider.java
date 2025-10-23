import java.util.Scanner;

public class InternetServiceProvider {
    public static void main(String[] args) {
        System.out.println("Which package did you buy?");
        Scanner scanner = new Scanner(System.in);
        String pkg = scanner.nextLine();

        System.out.println("How many hours were used?");
        int hours = scanner.nextInt();

        double ans;
        if (pkg.equals("A")) {
            ans = 9.95;
            if (hours > 10) ans += 2.0 * (hours - 10);
        }
        else if (pkg.equals("B")) {
            ans = 13.95;
            if (hours > 20) ans += 1.0 * (hours - 20);
        }
        else {
            ans = 19.95;
        }

        System.out.println("total charge: $" + ans);
    }
}
