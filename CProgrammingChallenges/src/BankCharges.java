import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args) {
        System.out.println("How many cheques did you write this month?");

        Scanner scanner = new Scanner(System.in);
        int cheques = scanner.nextInt();

        double ans = 10.0;
        if (cheques < 20) {
            ans += cheques * 0.10;
        }
        if (cheques >= 20 && cheques < 40) {
            ans += cheques * 0.08;
        }
        if (cheques >= 40 && cheques < 60) {
            ans += cheques * 0.06;
        }
        if (cheques >= 60){
            ans += cheques * 0.04;
        }

        System.out.println("Total fee: " + ans);
    }
}
