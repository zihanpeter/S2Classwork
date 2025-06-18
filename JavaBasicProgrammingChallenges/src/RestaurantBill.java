import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int charge;
        double tax;
        double tip;
        double total;

        System.out.println("Enter the charge for the meal: ");
        charge = scanner.nextInt();

        tax = charge * 0.0675;
        tip = (charge + tax) * 0.2;
        total = charge + tax + tip;

        System.out.println("Bill");
        System.out.println("Tax:" + tax);
        System.out.println("Tip:" + tip);
        System.out.println("Total:" + total);
    }
}
