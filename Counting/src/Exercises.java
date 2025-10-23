public class Exercises {

    /* this method counts the number of digits in num which are
 divisible by 3 or 4 */
    public static int countDiv3Or4(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 % 3 == 0 || num % 10 % 4 == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    /* this method counts the number of classes with 25 or more students
   make use of getNumStudents
    i.e. if class 1 contains 34 students, call getNumStudents(1) will return 34 */
    public static int countLargeClasses(int numClasses) {
        int count = 0;
        System.out.println("Num Students: ");
        for (int i = 1; i <= numClasses; i++) {
            int numStudents = getNumStudents(i);
            System.out.println(numStudents);
            if (numStudents >= 25) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /* todo: test data */
        System.out.println(countDiv3Or4(19380));
        System.out.println(countDiv3Or4(25698));

        System.out.println(countLargeClasses(3));
        System.out.println(countLargeClasses(5));
    }

    /* returns the number of students in a class
     * this is a helper method
     * ignore the logic */
    public static int getNumStudents(int classNum) {
        if (classNum % 3 == 0) {
            if (Math.random() < 0.4) {
                return (int) (Math.random() * 21 + 25);
            }
            else {
                return (int) (Math.random() * 50) + 1;
            }
        }
        else if (classNum % 5 == 0) {
            if (Math.random() < 0.6) {
                return (int) (Math.random() * 16 + 30);
            }
            else {
                return (int) (Math.random() * 50) + 1;
            }
        }
        else {
            return (int) (Math.random() * 30) + 1;
        }
    }
}
