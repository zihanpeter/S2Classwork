import java.util.Scanner;

public class RunningCoach {
    public static void main(String[] args) {
        /* modification
        change the program so that it subtracts each input from a goal distance
        the goal should be input at the start of the program with Scanner
        you can assume the user will never exceed the goal (to avoid handling negative numbers)
         */
        Scanner scanner = new Scanner(System.in);
        int totalKm = 0;
        int kmToday;
        // 1. declare the goal variable
        int goal;
        // 2. print a prompt, and use Scanner to get the goal
        System.out.println("Please input your goal distance (km): ");
        goal = scanner.nextInt();
        totalKm = goal;

        System.out.println("How many km did you run on day 1?");
        kmToday = scanner.nextInt();
        // 3. modify these lines to subtract kmToday from the goal, and output the remaining
        // distance to the goal instead of the total
        goal -= kmToday;
        System.out.println(goal + " km remaining.");

        System.out.println("How many km did you run on day 2?");
        kmToday = scanner.nextInt();
        // 4. make the same change as step 3 here
        goal -= kmToday;
        System.out.println(goal + " km remaining.");

        System.out.println("How many km did you run on day 3?");
        kmToday = scanner.nextInt();
        // 5. make the same change as step 3 here
        goal -= kmToday;
        System.out.println(goal + " km remaining.");


        // sample output:
        // What is your goal (km)? > 22
        // How many km did you run on day 1? > 12
        // 10km remaining
        // How many km did you run on day 2? > 3
        // 7km remaining
        // How many km did you run on day 3? > 5
        // 2km remaining

        /* additional modifications
        output the average distance per day rounded to the nearest whole number */
        int avgDistance = (int) (totalKm / 3.0 + 0.5);
        System.out.println("The average distance per day is " + avgDistance);
    }
}
