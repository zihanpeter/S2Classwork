

public class Student {

    /* a student must take at least 3 courses, and no more than 6 courses */

    private int numCourses;
    public Student(int n) {
        if (3 <= n && n <= 6) { // todo: write a condition that specifies which range to accept
            numCourses = n;
        }
        else {
            throw new IllegalArgumentException("The number of courses a student take must between 3 and 6, inclusive."); // todo: describe error with message in string literal argument
        }
    }

    public int getNumCourses() {
        return numCourses;
    }

}
