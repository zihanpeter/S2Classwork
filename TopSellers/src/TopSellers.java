// adapted from Gaddis - code listing 2-4 p. 73

public class TopSellers
{
    public static void main(String[] args)
    {
        /* modifications
        achieve the following output:
        Top sellers:
        Chocolate
        Coffee
        Water

        Busiest days: Wed., Fri., Sat.

        Follow the instructions to achieve this
        */

        // Use the \n escape sequence on these 3 lines to achieve the correct output
        System.out.print("Top sellers: \n");
        System.out.print("Chocolate\n");
        System.out.print("Coffee\n");

        // use the println method to achieve a new line here, plus a blank line
        System.out.println("Water");
        System.out.println();

        // Use the print method instead of println to get these on the same line.
        System.out.print("Busiest days: ");
        System.out.print("Wed., ");
        System.out.print("Fri., ");
        System.out.print("Sat.");
    }
}

