// Gaddis - code listing 2-18 p. 97
public class Contribution
{
    public static void main(String[] args)
    {
        /* modification
        The recommended percentage is stored as a variable
        Output the contribution for this amount, plus 3% lower and 3% higher.
        The program should provide correct output for any percentage in range [3, 97]
         */

        double monthlyPay = 6000.0;
        double contribution;
        // 1. declare and initialize a variable to store the percentage as 12%
        int persent = 12;
        // 2. modify this print statement (and only this one) to calculate the
        // contribution based on the variable from step 1
        // do not forget to modify the literal "5 percent is $..." appropriately
        // use the variable value to do this
        contribution = monthlyPay * persent * 0.01;
        System.out.println(persent + " percent is $" + contribution + " per month.");

        // 3. modify the following two print statements to print contributions for
        // 3% less and 3% more than the value of percentage
        // these values, plus the literals in the output, must be calculated
        // from percentage
        contribution = monthlyPay * (persent - 3) * 0.01;
        System.out.println((persent - 3) + " percent is $" + contribution + " per month.");

        contribution = monthlyPay * (persent + 3) * 0.01;
        System.out.println((persent + 3) + " percent is $" + contribution + " per month.");

        // expected output where percentage = 12 and monthlyPay = 6000.0
        // 12.0 percent is $720 per month
        // 9.0 percent is $540 per month
        // 15.0 percent is $900 per month

        // expected output where percentage = 8 and monthlyPay = 4250.0
        // 8.0 percent is $340 per month
        // 5.0 percent is $212.5 per month
        // 11.0 percent is $467.5 per month
    }
}

