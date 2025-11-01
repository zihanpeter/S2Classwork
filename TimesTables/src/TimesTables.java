public class TimesTables {
    public static void main(String[] args) {

        /* modifications
         * output all times tables up to 12 x 12
         * but do not include any duplicates
         * for example
         * 1 x 1 = 1, 1 x 2 = 2, 1 x 3 = 3 ...
         * then the two times table starts at 2 x 2, not 2 x 1, because this is a duplicate of 1 x 2
         * 2 x 2 = 4, 2 x 3 = 6...
         * then the three times table starts at 3 x 3 for the same reason
         * and so on
         * so 1x table has 12 outputs
         * 2x table has 11
         * 3x has 10
         * ...
         * 12x only has 1 - 12 x 12
         * you must achieve this only by modifying the loop headings - no if statements
         * */

        for (int i = 1; i <= 12; i++) {
            for (int j = i; j <= 12; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
