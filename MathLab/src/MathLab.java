public class MathLab {
    /*
    return the difference between a and b on the number line
    e.g. findDifference(-7, 5) ==> 12
    e.g. findDifference(100, 92) ==> 8
    as a rule, findDifference(a, b) == findDifference(b, a)
     */
    public static int findDifference(int a, int b) {
        return Math.abs(a - b);
    }

    /*
    calculate and return the area of a circle based on parameter r
    Investigate the Math class and find out how to get a Pi value
    e.g. areaOfCircle(5.5) ==> 95.03 (approx.)
     */
    public static double areaOfCircle(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /*
    find the first value of X for a quadratic equation
    this is explained further in the documentation for this lab
    */
    public static double findFirstX(int a, int b, int c) {
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    /*
    find the second value of X for a quadratic equation
    this is explained further in the documentation for this lab
    */
    public static double findSecondX(int a, int b, int c) {
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
}
