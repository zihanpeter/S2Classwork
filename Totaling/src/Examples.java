import java.util.Scanner;

public class Examples {
    /* this method generates 10 random integers between 256 and 1024.
 each integer is printed, and the sum of all generated numbers
 is returned */
    public static int randomSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int nextRandom = (int) (Math.random() * 769) + 256;
            System.out.println(nextRandom);
            sum += nextRandom;
        }
        return sum;
    }

    /* this method asks the user to input 5 race times
  output the average, ignoring all values less than zero */
    public static void average() {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Input next time: ");
            double next = scanner.nextDouble();
            if (next >= 0) {
                total += next;
                count++;
            }
        }
        if (count > 0) {
            System.out.println("average: " + (total / count));
        }
        else {
            System.out.println("average: 0.0");
        }
    }


    public static void main(String[] args) {
        int result1 = randomSum(); // visually inspect the result to verify correctness
        System.out.println(result1);

        average(); // e.g. 14.5, -0.01, 18.3, 14.2, -100 should output 15.6666...
    }
}
