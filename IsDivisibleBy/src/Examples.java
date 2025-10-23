public class Examples {
    /* this method returns true if everyone at a party can eat the same
    number of pizza slices, leaving no pizza left over */
    public static boolean eatAllPizzaEvenly(int numSlices, int numPeople) {
        return numSlices % numPeople == 0;
    }

    /* each table in a classroom seats 4 students. this methods returns
    the number of tables needed to seat all students in the class */
    public static int numTablesNeeded(int numStudents) {
        if (numStudents % 4 == 0) {
            return numStudents / 4;
        }
        else {
            return (numStudents / 4) + 1;
        }
    }

    public static void main(String[] args) {
        boolean result1 = eatAllPizzaEvenly(28, 3); // expected: false
        boolean result2 = eatAllPizzaEvenly(36, 6); // expected: true

        System.out.println(result1);
        System.out.println(result2);

        int result3 = numTablesNeeded(20); // expected: 5
        int result4 = numTablesNeeded(21); // expected: 6
        int result5 = numTablesNeeded(23); // expected: 6

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }

}
